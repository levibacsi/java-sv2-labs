package jdbc.activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    ActivityDao activityDao;

    @BeforeEach
    void init() throws SQLException{
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.clean();
        flyway.migrate();

        Activity activityOne = new Activity(LocalDateTime.of(2022, 2, 17, 18, 0), "uphill", ActivityType.BIKING);
        Activity activityTwo = new Activity(LocalDateTime.of(2022, 2, 17, 19, 0), "downhill", ActivityType.BIKING);
        Activity activityThree = new Activity(LocalDateTime.of(2022, 2, 17, 7, 30), "running to school", ActivityType.RUNNING);
        Activity activityFour = new Activity(LocalDateTime.of(2022, 2, 18, 14, 0), "climbing Everest", ActivityType.HIKING);
        Activity activityFive = new Activity(LocalDateTime.of(2022, 2, 19, 9, 15), "jammin", ActivityType.BASKETBALL);

        activityDao = new ActivityDao(dataSource);
        activityDao.saveActivity(activityOne); activityDao.saveActivity(activityTwo); activityDao.saveActivity(activityThree);
        activityDao.saveActivity(activityFour); activityDao.saveActivity(activityFive);
    }

    @Test
    void findActivityById() {
        Activity activity = activityDao.findActivityById(3);
        Assertions.assertEquals(LocalDateTime.of(2022, 2, 17, 7, 30), activity.getStartTime());
    }

    @Test
    void listActivities() {
        List<Activity> activities = activityDao.listActivities();

        Assertions.assertEquals(5, activities.size());
        Assertions.assertEquals("downhill", activities.get(1).getDescription());
    }

    @Test
    void saveActivityAndReturnGeneratedKeys() {
        Activity activity = activityDao.saveActivityAndReturnGeneratedKeys(new Activity(LocalDateTime.of(2022, 2, 20, 15, 50), "running errands", ActivityType.RUNNING));
        Assertions.assertEquals(6, activity.getId());
    }
}