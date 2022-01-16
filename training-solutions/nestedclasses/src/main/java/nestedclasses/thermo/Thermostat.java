package nestedclasses.thermo;

import java.util.ArrayList;
import java.util.List;

public class Thermostat {
    List<String> roomsToHeat = new ArrayList<>();
    List<Thermometer> thermometers = new ArrayList<>();
    private int temperatureLimit = 23;

    public void addThermometer(Thermometer thermometer){
        thermometers.add(thermometer);
        thermometer.setThermometerObserver(new ThermometerObserver() {
            @Override
            public void handleTemperatureChange(int temp, String room) {
                if (thermometer.getRoomTemperature() < temperatureLimit){
                    roomsToHeat.add(room);
                } else {
                    roomsToHeat.remove(room);
                }
            }
        });
    }

    public List<String> getRoomsToHeat() {
        return roomsToHeat;
    }
}
