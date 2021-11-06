package junit5fixture;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShipTest {
    private Ship ship;

    @BeforeEach
    void init() {
        ship = new Ship("Dreadnought", 1785, 12.3);
    }

    @Test
    void testName() {
        assertEquals("Dreadnought", ship.getName());
        assertNotEquals("USS Nimitz", ship.getName());
    }

    @Test
    void testYearOfConstruction() {
        assertEquals(1785, ship.getYearOfConstruction());
        assertTrue(ship.getYearOfConstruction() == 1785);
        assertFalse(ship.getYearOfConstruction() == 1885);
        assertEquals(true, ship.getYearOfConstruction() == 1785);
        assertEquals(false, ship.getYearOfConstruction() == 1885);
    }

    @Test
    void testLength() {
        assertEquals(12.3, ship.getLength(), 0.00001);
    }

    @Test
    void testNull() {
        Ship anotherShip = null;

        assertNotNull(ship);
        assertNull(anotherShip);
    }

    @Test
    void testSameObjects() {
        Ship anotherShip = ship;

        assertSame(ship, anotherShip);
    }

    @Test
    void testNotSameObjects() {
        Ship anotherShip = new Ship("Dreadnought", 1785, 12.3);

        assertNotSame(ship, anotherShip);
    }
}
