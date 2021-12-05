package inheritancemethods.plane;

public class Plane {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("John Smith", 40000);
        PriorityPassenger priorityPassenger = new PriorityPassenger("Bill Taylor", 40000, 10);
        FirstClassPassenger firstClassPassenger = new FirstClassPassenger("Charles O'Neill", 40000, 10);


        System.out.println(passenger.getName());
        System.out.println(passenger.getPriceOfPlaneTicket());

        System.out.println(priorityPassenger.getName());
        System.out.println(priorityPassenger.getPriceOfPlaneTicket());

        System.out.println(firstClassPassenger.getName());
        System.out.println(firstClassPassenger.getPriceOfPlaneTicket());
    }
}
