package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {

        System.out.println("Position: " + Position.DIRECTOR + "\n" +
                "Salary: " + Position.DIRECTOR.getSalary() + "\n" +
                "Benefit: " + Position.DIRECTOR.getBenefit());
    }
}

