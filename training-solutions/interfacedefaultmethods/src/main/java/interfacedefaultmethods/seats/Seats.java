package interfacedefaultmethods.seats;

public interface Seats {
    default int getNumberOfSeats(){
        return 5;
    };
}
