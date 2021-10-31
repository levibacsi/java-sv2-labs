package enumtype.university;

public enum University {
    BME ("Budapesti Műszaki és Gazdaságtudományi Egyetem"), ELTE("Eötvös Loránd Tudományegyetem"), KGRE("Károli Gáspár Református Egyetem"), PPKE("Pázmány Péter Katolikus Egyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
