package controladvanced.labels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabelsTest {

    @Test
    void getTableOfNumbers() {
        Labels labels = new Labels();

        int[][] table = labels.getTableOfNumbers(6);

        assertEquals(5, table[2][1]);
        assertEquals(10, table[4][4]);
    }
}