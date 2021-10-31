package packages.namemain;

import packages.prefix.Prefix;
import packages.firstname.FirstName;
import packages.lastname.LastName;


public class NameMain {
    public static void main(String[] args) {
        Prefix prefix = new Prefix("Ms.");
        FirstName firstName = new FirstName ("Nancy");
        LastName lastName = new LastName ("Smith");

        System.out.println(prefix.getPre() + " " + firstName.getFirst() + " " + lastName.getLast());
    }
}
