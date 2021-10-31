package introdate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("George Thomas",1990, 11, 1);
        System.out.println(employee.getName() + "\n" + employee.getDateOfBirth() +"\n" + employee.getBeginEmployment());

        employee.setName("George Thomas, PhD");
        System.out.println(employee.getName());
    }
}
