package composition.person;

public class Address {
    private String country;
    private String city;
    private String streetAndNumber;
    private String zipCode;

    public String addressToString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", streetAndNumber='" + streetAndNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public Address(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void correctData(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }
}
