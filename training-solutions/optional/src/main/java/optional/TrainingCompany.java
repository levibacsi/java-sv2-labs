package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class TrainingCompany {
    private List<Course> courses = new ArrayList<>();

    public TrainingCompany(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse (Course course){
        courses.add(course);
    }

    public Course getCheaperCourse(int maxPrice){
        Optional<Course> course = Optional.empty();
        for (Course c: courses){
            if (c.getPrice() <= maxPrice){
                course = Optional.of(c);
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course."));
    }

    public int getPriceOfCourseWithGivenNameAndLevel(String name, Level level){
        Optional<Course> course = Optional.empty();
        for (Course c: courses){
            if (c.getName().equals(name) && c.getLevel().equals(level)){
                course = Optional.of(c);
            }
        }
        return course.orElseThrow(() -> new IllegalArgumentException("No such course.")).getPrice();
    }

    public String getNameOfCourseWithGivenLevel(Level level){
        Optional<String> course = Optional.empty();
        for (Course c: courses){
            if (c.getLevel().equals(level)){
                course = Optional.of(c.getName());
            }
        }
        return course.orElse("Sorry, there is no course at this level.");
    }
}
