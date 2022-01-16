package nestedclasses.thermo;

public class Thermometer{
    private String roomName;
    private int roomTemperature;
    private ThermometerObserver observer;

    public Thermometer(String roomName, int roomTemperature) {
        this.roomName = roomName;
        this.roomTemperature = roomTemperature;
    }

    public String getRoomName() {
        return roomName;
    }

    public double getRoomTemperature() {
        return roomTemperature;
    }

    public ThermometerObserver getObserver() {
        return observer;
    }

    public void onTemperatureChanged(){
        if (observer != null){
            observer.handleTemperatureChange(roomTemperature, roomName);
        }
    }

    public void setTemperature(int roomTemperature) {
        this.roomTemperature = roomTemperature;
        onTemperatureChanged();
    }

    public void setThermometerObserver(ThermometerObserver observer){
        this.observer = observer;
        onTemperatureChanged();
    }
}
