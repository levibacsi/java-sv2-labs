package composition.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("George Short", "GC0312");
        Address address = new Address("England", "Liverpool", "Main street 51", "56LPM11");
        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Georgina Short", "GCM0312");
        System.out.println(person.personToString());

        person.getAddress().correctData("Wales", "Cardigan", "Lleigowontheumingtompen 23", "43HD65");

        System.out.println(person.getAddress().addressToString());

        Address newAddress = new Address("Scotland", "Aberdeen", "Ale street 11",  "76DTH76");

        person.moveTo(newAddress);

        System.out.println(person.getAddress().addressToString());
    }

}
