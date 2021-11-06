package controlselection.week;

public class DayOfWeeks {
    public String dayOfWeek (String day){
        String timeOfWeek;
        switch(day.toLowerCase()){
            case "monday":
                timeOfWeek = "hét eleje";
                break;
            case "tuesday", "wednesday", "thursday":
                timeOfWeek = "hét közepe";
                break;
            case "friday":
                timeOfWeek = "majdnem hétvége";
                break;
            case "saturday", "sunday":
                timeOfWeek = "hét vége";
                break;
            default:
                timeOfWeek = "ismeretlen nap";
        }

        return timeOfWeek;
    }
}
