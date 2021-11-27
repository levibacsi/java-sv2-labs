package methodparam.sums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeparateTest {
    @Test
    void testCreate(){
        Separate separate = new Separate(0.01, -0.01);
        assertEquals(0.01, separate.getPositive());
        assertEquals(-0.01, separate.getNegative());
    }
}