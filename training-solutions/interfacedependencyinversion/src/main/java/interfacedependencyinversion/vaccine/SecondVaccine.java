package interfacedependencyinversion.vaccine;

import java.util.ArrayList;
import java.util.List;

public class SecondVaccine implements Vaccine{

    private List<Person> vaccinationList = new ArrayList<>();

    @Override
    public List<Person> getVaccinationList() {
        return vaccinationList;
    }

    @Override
    public void generateVaccinationList(List<Person> registered) {
        for (Person p: registered) {
            if (p.getPregnant() == Pregnancy.NO && p.getChronic() == ChronicDisease.NO && p.getAge() < 65) {
                vaccinationList.add(p);
            }
        }

        for (Person p: registered){
            if (p.getPregnant() == Pregnancy.NO && p.getChronic() == ChronicDisease.NO && p.getAge() >= 65){
                vaccinationList.add(p);
            }
        }
    }
}
