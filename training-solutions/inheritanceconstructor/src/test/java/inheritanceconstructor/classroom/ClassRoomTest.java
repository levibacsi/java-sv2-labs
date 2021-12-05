package inheritanceconstructor.classroom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomTest {
    @Test
    void testCreate() {
        //Given
        ClassRoom classroom = new ClassRoom("122", 20, Facility.CHALKBOARD);
        //Then
        assertEquals("122", classroom.getLocation());
        assertEquals(20, classroom.getCapacity());
        assertEquals(Facility.CHALKBOARD, classroom.getFacility());
    }

    @Test
    void testIsSuitableSuccess() {
        //Given
        ClassRoom classroom = new ClassRoom("122", 20, Facility.COMPUTERS);
        Course course = new Course(15, Facility.COMPUTERS);
        //Then
        assertTrue(classroom.isSuitable(course));

    }

    @Test
    void tesIsSuitableFail() {
        //Given
        ClassRoom classroom = new ClassRoom("122", 20, Facility.COMPUTERS);
        Course course = new Course(20, Facility.CHALKBOARD);
        Course courseTwo = new Course(21, Facility.COMPUTERS);
        //Then
        assertFalse(classroom.isSuitable(course));
        assertFalse(classroom.isSuitable(courseTwo));
    }

}