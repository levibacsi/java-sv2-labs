package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("John Taylor");
        client.setYear(2000);
        client.setAddress("Budapest");
        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());
        client.migrate("London");
        System.out.println(client.getAddress());
    }
}
