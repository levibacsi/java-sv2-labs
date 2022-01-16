package collectionsqueue;

import java.util.*;

public class Vaccination {
    private List<Person> people = new ArrayList<>();

    public List<Person> getPeople() {
        return people;
    }

    public Queue<Integer> getVaccinationOrder(List<Person> people){
        Queue<Integer> agesToGetVaccinated = new PriorityQueue<>();

        for (Person p: people){
            if (p.getAge() >= 18 && p.getAge() <= 65){
                agesToGetVaccinated.add(p.getAge());
            }
        }
        return agesToGetVaccinated;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Bill", 17));
        people.add(new Person("Derrick", 33));
        people.add(new Person("Eve", 66));
        people.add(new Person("Jordan", 65));
        people.add(new Person("Courtney", 19));
        people.add(new Person("Georgina", 18));

        Vaccination vaccination = new Vaccination();

        Queue<Integer> vaccinationOrder = vaccination.getVaccinationOrder(people);

        System.out.println(vaccinationOrder);
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder.poll());
        System.out.println(vaccinationOrder);
    }
}
