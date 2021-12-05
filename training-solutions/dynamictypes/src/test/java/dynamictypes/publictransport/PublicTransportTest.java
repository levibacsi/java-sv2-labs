package dynamictypes.publictransport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PublicTransportTest {
    PublicVehicle bus = new Bus(5, 7,"Volvo");
    PublicVehicle tram = new Tram(2, 30, 3);
    PublicVehicle metro = new Metro(4, 40, 5);

    PublicTransport publicTransport = new PublicTransport();

    @Test
    void testAddVehicle (){
        publicTransport.addVehicle(bus);
        publicTransport.addVehicle(tram);
        publicTransport.addVehicle(metro);

        assertEquals(3, publicTransport.getPublicVehicleList().size());
    }
}