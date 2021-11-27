package methodparam.marriage;

import java.util.List;

public class Woman {
    private String name;
    private List<RegisterDate> registerDates;

    public Woman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }

    public void addRegisterDate(RegisterDate registerDate) {
        registerDates.add(registerDate);
    }
}
