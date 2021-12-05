package statemachine.typewriter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeWriterStateTest {
    @Test
    void testNext() {

        assertEquals(TypeWriterState.CAPSON, TypeWriterState.CAPSOFF.next());
        assertEquals(TypeWriterState.CAPSOFF, TypeWriterState.CAPSON.next());
    }
}