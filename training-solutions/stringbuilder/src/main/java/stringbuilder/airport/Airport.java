package stringbuilder.airport;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public String getDeletedFlights() {
        StringBuilder sb = new StringBuilder("Cancelled flights: ");
        for (Flight f : flights) {
            if (f.getStatus() == Status.DELETED) {
                sb.append("\n");
                sb.append(f.getFlightNumber());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Flight toBerlin = new Flight("B-2351", Status.DELETED);
        Flight toMadrid = new Flight("M-3453", Status.ACTIVE);
        Flight toAthens = new Flight("A-3598", Status.DELETED);

        Airport airport = new Airport();
        airport.addFlight(toBerlin);
        airport.addFlight(toMadrid);
        airport.addFlight(toAthens);

        String deletedFlights = airport.getDeletedFlights();

        System.out.println(deletedFlights);
    }
}
