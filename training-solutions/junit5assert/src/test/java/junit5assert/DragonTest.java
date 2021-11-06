package junit5assert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DragonTest {
        @Test
        void testName() {
            Dragon dragon = new Dragon("Dragon", 7, 3.6);

            assertEquals("Dragon", dragon.getName());
            assertNotEquals("Dradon", dragon.getName());
        }

        @Test
        void testNumberOfHeads() {
            Dragon dragon = new Dragon("Dragon", 7, 3.6);

            assertEquals(7, dragon.getNumberOfHeads());
            assertTrue(dragon.getNumberOfHeads() == 7);
            assertFalse(dragon.getNumberOfHeads() == 3);
            assertEquals(true, dragon.getNumberOfHeads() == 7);
            assertEquals(false, dragon.getNumberOfHeads() == 3);
        }

        @Test
        void testHeight() {
            Dragon dragon = new Dragon("Dragon", 7, 3.6);

            assertEquals(3.6, dragon.getHeight(), 0.005);
        }

        @Test
        void testNull() {
            Dragon dragon = new Dragon("Dragon", 7, 3.6);
            Dragon anotherDragon = null;

            assertNotNull(dragon);
            assertNull(anotherDragon);
        }

        @Test
        void testSameObjects() {
            Dragon dragon = new Dragon("Dragon", 7, 3.6);
            Dragon anotherDragon = dragon;

            assertSame(dragon, anotherDragon);
        }

        @Test
        void testNotSameObjects() {
            Dragon dragon = new Dragon("Dragon", 7, 3.6);
            Dragon anotherDragon = new Dragon("Dragon", 7, 3.6);

            assertNotSame(dragon, anotherDragon);
        }
    }

