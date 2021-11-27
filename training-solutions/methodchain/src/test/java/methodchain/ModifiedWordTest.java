package methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifiedWordTest {
    ModifiedWord modifiedWord = new ModifiedWord();

    @Test
    void testSbModify() {
        assertEquals("AxMy", modifiedWord.modifySb("alma"));
        assertEquals("KxRy", modifiedWord.modifySb("körte"));
        assertEquals("SxIy", modifiedWord.modifySb("szilva"));
    }

    @Test
    void testModify(){
        assertEquals("AxMy", modifiedWord.modify("alma"));
        assertEquals("KxRy", modifiedWord.modify("körte"));
        assertEquals("SxIy", modifiedWord.modify("szilva"));
    }
}