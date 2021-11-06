package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void addHour(Hour hour){
        hoursOfDay.add(hour);
    }

    public void setDayPeriod(){
        for (Hour list: hoursOfDay){
            if (list.getHourNumber() > 6 && list.getHourNumber() < 22) {
                list.setPeriod(DayPeriod.DAYTIME);
            } else {
                list.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }

}
