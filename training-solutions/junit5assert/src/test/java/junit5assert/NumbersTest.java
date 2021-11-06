package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class NumbersTest {
    @Test
    void testGetEvenNumbers(){
        // Given
        Numbers numbers = new Numbers();
        // When
        int [] numberArray = new int[] {2, 8, 5, 6, 2, 3, 9};
        // Then
        int[] expected = new int[]{2, 8, 0, 6, 2, 0, 0};

        assertArrayEquals(expected, numbers.getEvenNumbers(numberArray));
    }
}
