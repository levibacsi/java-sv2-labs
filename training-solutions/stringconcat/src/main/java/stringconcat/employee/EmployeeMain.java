package stringconcat.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Jonathan Swift", "writer", 10000);

        System.out.println(employee.getName());
        System.out.println(employee.getJob());
        System.out.println(employee.getSalary());
        System.out.println(employee.toString());
    }
}
