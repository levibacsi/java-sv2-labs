package controlselection.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingsTest {

    @Test
    void testGreet() {

        Greetings greetings = new Greetings();

        assertEquals("jó éjt",greetings.greet(4,59));
        assertEquals("jó reggelt",greetings.greet(5,0));
        assertEquals("jó reggelt", greetings.greet(8, 59));
        assertEquals("jó napot", greetings.greet(9, 0));
        assertEquals("jó napot", greetings.greet(15, 29));
        assertEquals("jó estét", greetings.greet(18, 30));
        assertEquals("jó estét", greetings.greet(19, 59));
        assertEquals("jó éjt", greetings.greet(20, 00));
    }
}