package jdbc.activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {
    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveActivity(Activity activity){
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "insert into activities(start_time, description, activity_type) values (?, ?, ?);")) {

                statement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                statement.setString(2, activity.getDescription());
                statement.setString(3, activity.getType().toString());
                statement.executeUpdate();

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert activity", sqle);
        }
    }

    public Activity saveActivityAndReturnGeneratedKeys(Activity activity) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "insert into activities(start_time, description, activity_type) values (?, ?, ?);",
                     Statement.RETURN_GENERATED_KEYS)) {

            statement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            statement.setString(2, activity.getDescription());
            statement.setString(3, activity.getType().toString());
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                return new Activity(rs.getInt(1), activity.getStartTime(), activity.getDescription(), activity.getType());
            }
            throw new IllegalStateException("Cannot get generated keys.");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert.", sqle);
        }
    }

    public Activity findActivityById(long id){
        for (Activity a: listActivities()){
            if ( a.getId() == id){
                return a;
            }
        }
        throw new IllegalStateException("ID not found");
    }

    public List<Activity> listActivities(){
        List<Activity> allActivities = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from activities")){
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                LocalDateTime startTime = resultSet.getTimestamp("start_time").toLocalDateTime();
                String description = resultSet.getString("description");
                ActivityType activityType = ActivityType.valueOf(resultSet.getString("activity_type"));

                allActivities.add(new Activity(id, startTime, description, activityType));
            }
        } catch (SQLException sqlException) {
            throw new IllegalStateException("Cannot query");
        }
        return allActivities;

    }

    public void saveActivityAndSaveTrackPoints(Activity activity) {
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            try {
                int activityId = saveActivityWithTrackPoints(activity, conn);
                saveTrackPoints(activityId, activity, conn);
                conn.commit();
            } catch (Exception ex) {
                conn.rollback();
                throw new IllegalArgumentException("Transaction not succeeded!", ex);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Wrong connection.", sqle);
        }
    }

    private int saveActivityWithTrackPoints(Activity activity, Connection conn) throws SQLException {
        int activityId = 0;
        try (PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, description, activity_type) values (?, ?, ?);",
                Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDescription());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                activityId = rs.getInt(1);
            }
            return activityId;
        }
    }

    private void saveTrackPoints(int activityId, Activity activity, Connection conn) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("insert into track_point(id, tp_time, lat, lon) values (?, ?, ?, ?);")) {
            for (TrackPoint t : activity.getTrackPoints()) {
                if (t.getLat() < -90.0 || t.getLat() > 90.0 || t.getLon() < -180 || t.getLon() > 180.0) {
                    throw new IllegalArgumentException("Not suitable values for latitude or longitude!");
                }
                stmt.setInt(1, activityId);
                stmt.setDate(2, Date.valueOf(t.getTime()));
                stmt.setDouble(3, t.getLat());
                stmt.setDouble(4, t.getLon());

                stmt.executeUpdate();
            }
        }
    }

    public Activity findActivityWithTrackPointsById(int id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?;")) {
            stmt.setInt(1, id);
            return getActivityById(id, stmt, conn);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot select activity or trackpoints.", sqle);
        }
    }

    private Activity getActivityById(int id, PreparedStatement stmt, Connection conn) throws SQLException {
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                String description = rs.getString("description");
                ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
                List<TrackPoint> trackPoints = getTrackPoints(id, conn);
                return new Activity(id, startTime, description, type, trackPoints);
            }
            throw new IllegalArgumentException("No activity with this id.");
        }
    }

    private List<TrackPoint> getTrackPoints(int id, Connection conn) throws SQLException {
        try (PreparedStatement stmt = conn.prepareStatement("select * from track_point where id = ?;")) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                return loadTrackPoints(rs);
            }
        }
    }

    private List<TrackPoint> loadTrackPoints(ResultSet rs) throws SQLException {
        List<TrackPoint> trackpoints = new ArrayList<>();
        while (rs.next()) {
            trackpoints.add(extractTrackPoint(rs));
        }
        return trackpoints;
    }

    private TrackPoint extractTrackPoint(ResultSet rs) throws SQLException {
        LocalDate time = rs.getDate("tp_time").toLocalDate();
        double lat = rs.getDouble("lat");
        double lon = rs.getDouble("lon");

        return new TrackPoint(time, lat, lon);
    }
}
