package collectionsequalshash;

public class Person {
    private String name;
    private int age;
    private String taj;

    public Person(String name, int age, String taj) {
        this.name = name;
        this.age = age;
        this.taj = taj;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTaj() {
        return taj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return taj.equals(person.taj);
    }

    @Override
    public int hashCode() {
        return taj.hashCode();
    }

    public static void main(String[] args) {
        Person girl = new Person("Jane Smith", 21, "024-579-864");
        Person woman = new Person("Jane Taylor", 31, "024-579-864");

        System.out.println(girl.equals(woman));
        System.out.println(girl.hashCode());
        System.out.println(woman.hashCode());
        System.out.println(girl.hashCode() == woman.hashCode());

    }
}
