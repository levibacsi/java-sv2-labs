package methodoverloading;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ClassFiveA {
    private List<String> students = Arrays.asList("Peter", "Andrew", "James", "John", "Mary");

    public String getTodayReferringStudent(int number){
        return students.get(number - 1);
    }

    public String getTodayReferringStudent(Number number){
        return students.get(number.getValue() - 1);
    }

    public String getTodayReferringStudent(String numberName){
        return students.get(Number.valueOf(numberName.toUpperCase()).getValue() - 1);
    }
}
