package realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        Address address = new Address("Los Angeles", "FR2345", "Wood str.", 3);
        Details details = new Details("Nice view", address, 123, 2000);
        RealEstate realEstate = new RealEstate("House", 5439.99, details);

        System.out.println(address);
        System.out.println(details);
        System.out.println(realEstate);
    }
}
