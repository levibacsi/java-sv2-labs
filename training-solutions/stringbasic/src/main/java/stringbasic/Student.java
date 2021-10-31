package stringbasic;

public class Student {
    private Person student;
    private String neptun;
    private String Id;
    private String cardNumber;

    public Student(Person student, String neptun, String id) {
        this.student = student;
        this.neptun = neptun;
        Id = id;
    }

    public Person getStudent() {
        return student;
    }

    public void setStudent(Person student) {
        this.student = student;
    }

    public String getNeptun() {
        return neptun;
    }

    public void setNeptun(String neptun) {
        this.neptun = neptun;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
