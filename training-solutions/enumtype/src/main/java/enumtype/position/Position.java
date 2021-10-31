package enumtype.position;

public enum Position {
    DIRECTOR (4_000_000, "luxury car"),
    MANAGER (2_000_000, "expensive car"),
    TEAMLEADER (1_000_000, "cheap car"),
    TEAMMEMBER (500_000, "phone");

    private int salary;
    private String benefit;

    Position(int salary, String benefit) {
        this.salary = salary;
        this.benefit = benefit;
    }

    public int getSalary() {
        return salary;
    }

    public String getBenefit() {
        return benefit;
    }
}
