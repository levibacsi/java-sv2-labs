package fleet;

public class Liner implements Ship, CanCarryPassengers{
    private CanCarryPassengers canCarryPassengers;

    public Liner(int canCarryPassengers) {
        this.canCarryPassengers = new CanCarryPassengersBehaviour(canCarryPassengers);
    }

    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}
