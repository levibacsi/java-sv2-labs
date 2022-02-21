package jdbc.activitytracker;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        Activity activityOne = new Activity(LocalDateTime.of(2022, 2, 17, 18, 0), "uphill", ActivityType.BIKING);
        Activity activityTwo = new Activity(LocalDateTime.of(2022, 2, 17, 19, 0), "downhill", ActivityType.BIKING);
        Activity activityThree = new Activity(LocalDateTime.of(2022, 2, 17, 7, 30), "running to school", ActivityType.RUNNING);
        Activity activityFour = new Activity(LocalDateTime.of(2022, 2, 18, 14, 0), "climbing Everest", ActivityType.HIKING);
        Activity activityFive = new Activity(LocalDateTime.of(2022, 2, 19, 9, 15), "jammin", ActivityType.BASKETBALL);

        List<Activity> activities = new ArrayList<>();
        activities.add(activityOne); activities.add(activityTwo); activities.add(activityThree); activities.add(activityFour); activities.add(activityFive);

        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUser("activitytracker");
            dataSource.setPassword("activitytracker");
        } catch (SQLException throwables) {
            throw new IllegalStateException("Cannot reach database");
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        ActivityTrackerMain atMain = new ActivityTrackerMain();
        atMain.insertActivities(dataSource, activities);

        System.out.println(atMain.findAllActivities(dataSource));
        System.out.println(atMain.findActivityById(dataSource, 3));

        }

        private void insertActivities (DataSource dataSource, List<Activity> activities){
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "insert into activities(start_time, description, activity_type) values (?, ?, ?);")) {
            for (Activity activity : activities) {
                statement.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                statement.setString(2, activity.getDescription());
                statement.setString(3, activity.getType().toString());
                statement.executeUpdate();
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert activities", sqle);
        }
    }

    public List<Activity> findAllActivities (DataSource dataSource){
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

    public Activity findActivityById(DataSource dataSource, int id){
        for (Activity a: findAllActivities(dataSource)){
            if ( a.getId() == id){
                return a;
            }
        }
        throw new IllegalStateException("ID not found");
    }


}
