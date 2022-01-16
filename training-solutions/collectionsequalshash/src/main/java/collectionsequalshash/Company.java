package collectionsequalshash;

public class Company {
    private String company;
    private String taxNumber;

    public Company(String company, String taxNumber) {
        this.company = company;
        this.taxNumber = taxNumber;
    }

    public String getCompany() {
        return company;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company1 = (Company) o;

        if (!company.equals(company1.company)) return false;
        return taxNumber.equals(company1.taxNumber);
    }

    @Override
    public int hashCode() {
        int result = company.hashCode();
        result = 31 * result + taxNumber.hashCode();
        return result;
    }
}
