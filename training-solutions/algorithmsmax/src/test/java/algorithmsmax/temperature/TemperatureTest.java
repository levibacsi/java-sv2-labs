package algorithmsmax.temperature;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void testGetMin(){
        Temperature temp = new Temperature();
        List<Integer> temperatures = Arrays.asList(5, 8, 9, 15, 2, 0, -1, -4, 7, 1);
        assertEquals(-4, temp.getMin(temperatures));
    }

}