package controlselection.week;

import controlselection.month.DayInMonth;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfWeeksTest {

    @Test
    void dayOfWeek() {
        DayOfWeeks dayOfWeeks = new DayOfWeeks();
        assertEquals("hét eleje", dayOfWeeks.dayOfWeek("Monday"));
        assertEquals("hét közepe", dayOfWeeks.dayOfWeek("Wednesday"));
        assertEquals("majdnem hétvége", dayOfWeeks.dayOfWeek("Friday"));
        assertEquals("hét vége", dayOfWeeks.dayOfWeek("Sunday"));
        assertEquals("ismeretlen nap", dayOfWeeks.dayOfWeek("Fridey"));
    }
}