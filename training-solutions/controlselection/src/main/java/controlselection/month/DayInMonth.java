package controlselection.month;

public class DayInMonth {
    public int getDaysInMonth(int year, String month) {
        int daysInMonth;
        switch (month.toLowerCase()) {

            case "april", "june", "september", "november":
                daysInMonth = 30;
                break;

            case "january", "march", "may", "july", "august", "october", "december":
                daysInMonth = 31;
                break;

            case "february":
                if (year % 400 == 0) {
                    daysInMonth = 29;
                } else if (year % 4 == 0 && year % 100 > 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;

            default:
                daysInMonth = 0;
        }

        return daysInMonth;
    }
}
