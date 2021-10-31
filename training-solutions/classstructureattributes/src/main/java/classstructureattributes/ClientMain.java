package classstructureattributes;

import classstructureattributes.Client;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "John Taylor";
        client.year = 2000;
        client.address = "Budapest";
        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.address);
    }
}
