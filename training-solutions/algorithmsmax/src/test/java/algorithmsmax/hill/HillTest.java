package algorithmsmax.hill;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HillTest{
    Hill hill = new Hill();

    @Test
    void testGetMax(){
        List<Integer> heights = Arrays.asList(500, 800, 900, 150, 200, -1000, 400, 700, 0);
        assertEquals(900, hill.getMax(heights));
    }
}