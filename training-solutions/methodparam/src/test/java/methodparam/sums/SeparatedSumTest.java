package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparatedSumTest {

    @Test
    void numberListReader() {
    }

    @Test
    void sum() {
        SeparatedSum separatedSum = new SeparatedSum();
        assertEquals(110.6, separatedSum.sum(separatedSum.numberListReader()).getPositive(), 0.0001);
        assertEquals(-153.3, separatedSum.sum(separatedSum.numberListReader()).getNegative(), 0.0001);
    }
}