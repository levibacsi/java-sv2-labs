package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {

        Person person = new Person("First Man", 29);

        Person person1 = person;

        Person person2 = person1;

        person2.setName("First Woman");

        System.out.println(person.getName());
        System.out.println(person1.getName());
        System.out.println(person2.getName());

        int number1 = 24;
        int number2 = number1;
        number2 ++;

        System.out.println(number1);
        System.out.println(number2);

        person2 = new Person("Second Man", 20);
        System.out.println(person.getName() + " - " + person.getAge());
        System.out.println(person2.getName() + " - " + person2.getAge());
    }
}
