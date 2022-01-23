package streamsalgorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {
    private String name;
    private int birthYear;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Brian", 1987));
        employees.add(new Employee("Uriel", 2001));
        employees.add(new Employee("Lizzy", 1995));
        employees.add(new Employee("Kim", 2010));
        employees.add(new Employee("Susan", 1979));
//1
        List<Integer> allBirthYears = employees.stream()
                .mapToInt(Employee::getBirthYear)
                .sorted()
                .boxed().toList();
        System.out.println(allBirthYears);
//2
        List<Integer> allAges = allBirthYears.stream()
                .map(age -> 2022 - age)
                .toList();
        System.out.println(allAges);

        System.out.println(allAges.stream()
                .mapToInt(age -> age)
                .sum());
//3
        System.out.println(employees.stream().count());

//4
        System.out.println(allBirthYears.stream()
                .filter(integer -> integer < 1990)
                .count());
//5
        System.out.println(employees.stream()
                .mapToInt(Employee::getBirthYear)
                .min()
                .orElseThrow(() -> new IllegalArgumentException("None")));

//6
        String name = employees.stream()
                .sorted((o1, o2) -> o1.getBirthYear() - o2.getBirthYear())
                .map(Employee::getName)
                .findFirst().orElseThrow(() -> new IllegalArgumentException("None"));
        System.out.println(name);

//7
    boolean bornBefore1980 = employees.stream()
            .mapToInt(Employee::getBirthYear)
            .allMatch(e -> e < 1980);
        System.out.println(bornBefore1980);
//8
        List<Employee> bornBefore1990 = employees.stream()
                .filter(e -> e.getBirthYear() < 1990)
                .toList();
        System.out.println(bornBefore1990.get(0).getName());

//9
        System.out.println(employees.stream()
            .map(Employee::getName)
            .toList());
//10
        List<String> allBornBefore1990 = employees.stream()
                .filter(e -> e.getBirthYear() < 1990)
                .map(Employee::getName)
                .toList();
        System.out.println(allBornBefore1990);
    }
}
