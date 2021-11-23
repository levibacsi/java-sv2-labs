package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void testCountChildrenWithHeightGreaterThan() {
        Height height = new Height();
        List<Integer> heightsList = Arrays.asList(123, 145, 167, 141, 143, 144);
        assertEquals(3, height.countChildrenWithHeightGreaterThan(heightsList, 144));
    }
}