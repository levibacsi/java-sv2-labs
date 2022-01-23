package optional;

public class Course {
    private String courseName;
    private Level courseLevel;
    private int coursePrice;

    public Course(String courseName, Level courseLevel, int coursePrice) {
        this.courseName = courseName;
        this.courseLevel = courseLevel;
        this.coursePrice = coursePrice;
    }

    public String getName() {
        return courseName;
    }

    public int getPrice() {
        return coursePrice;
    }

    public Level getLevel() {
        return courseLevel;
    }
}
