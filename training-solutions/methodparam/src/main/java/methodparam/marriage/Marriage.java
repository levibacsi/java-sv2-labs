package methodparam.marriage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Marriage {
    public void getMarried(Woman woman, Man man){
        addRegisterDate(woman, man);
    }

    private void setWomanMarriedName(Woman woman, String name) {
        String[] names = name.split(" ");
        String husbandLastName = names[1];

        String[] womanNames = woman.getName().split(" ");
        String wifeLastName = womanNames[0];
        woman.setName(wifeLastName + husbandLastName);
    }

    private void addRegisterDate(Woman woman, Man man) {
        woman.addRegisterDate(new RegisterDate("time of wedding", LocalDate.now()));
        man.addRegisterDate(new RegisterDate("time of wedding", LocalDate.now()));
    }
}
