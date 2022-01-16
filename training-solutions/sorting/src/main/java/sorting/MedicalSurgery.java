package sorting;

import java.util.*;

public class MedicalSurgery {
    private List<Patient> patients = new ArrayList<>();

    public MedicalSurgery(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatientsInTimeOrder(){
        List<Patient> patientsInTimeOrder = new ArrayList<>(patients);
        patientsInTimeOrder.sort(new PatientComparator());
        return patientsInTimeOrder;
    }
}
