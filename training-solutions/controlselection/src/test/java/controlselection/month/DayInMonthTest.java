package controlselection.month;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    @Test
    void getDaysInMonth() {
        DayInMonth dayInMonth = new DayInMonth();
        assertEquals(30, dayInMonth.getDaysInMonth(2020, "April"));
        assertEquals(31, dayInMonth.getDaysInMonth(2020, "May"));
        assertEquals(28, dayInMonth.getDaysInMonth(2021, "February"));
        assertEquals(29, dayInMonth.getDaysInMonth(2020, "February"));
        assertEquals(29, dayInMonth.getDaysInMonth(2000, "February"));
        assertEquals(0, dayInMonth.getDaysInMonth(2020, "Febuary"));
    }
}