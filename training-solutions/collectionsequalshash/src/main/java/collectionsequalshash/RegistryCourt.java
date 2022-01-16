package collectionsequalshash;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();

        Company companyBig = new Company("MOL", "45635466");
        Company companyMed = new Company("COOP", "8697612934");
        Company companySml = new Company("Jani ABC", "13452345");

        companies.add(companyBig);
        companies.add(companyMed);
        companies.add(companySml);

        System.out.println(companies.contains(new Company("MOL", "45635466")));
        System.out.println(companies.contains(new Company("COOP", "13452345")));

    }
}
