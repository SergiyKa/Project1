import junit.ArrayListDay;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;


public class DayListTest {

    @BeforeAll
    public static void classSetup(){
        System.out.println("Before all method");
    }

    @AfterAll
    public static void classTearDown(){
        System.out.println("After all method");
    }

    @Test
    public void correctDay1Test() {
        int dayNumber = 1;
        String expectedResult = ("Sunday");

        String actualResult = ArrayListDay.getDay(1);

        assertNotNull(actualResult, "Null was returned");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void correctDay2Test() {
        int dayNumber = 2;
        String expectedResult = ("Monday");

        String actualResult = ArrayListDay.getDay(2);

        assertNotNull(actualResult, "Null was returned");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void correctDay3Test() {
        int dayNumber = 3;
        String expectedResult = ("Tuesday");

        String actualResult = ArrayListDay.getDay(3);

        assertNotNull(actualResult, "Null was returned");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void correctDay4Test() {
        int dayNumber = 4;
        String expectedResult = ("Wednesday");

        String actualResult = ArrayListDay.getDay(4);

        assertNotNull(actualResult, "Null was returned");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void correctDay5Test() {
        int dayNumber = 5;
        String expectedResult = ("Thursday");

        String actualResult = ArrayListDay.getDay(100);

        assertNotNull(actualResult, "Null was returned");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void correctDay6Test() {
        int dayNumber = 6;
        String expectedResult = ("Friday");

        String actualResult = ArrayListDay.getDay(-7);

        assertNotNull(actualResult, "Null was returned");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void correctDay7Test() {
        int dayNumber = 7;
        String expectedResult = ("Saturday");

        String actualResult = ArrayListDay.getDay(7);

        assertNotNull(actualResult, "Null was returned");
        assertEquals(expectedResult, actualResult);
        assertFalse(dayNumber > 7);
        assertFalse(dayNumber < 1);
        assertFalse(dayNumber == 0);
        assertNull(dayNumber);

    }

    @Test
    @DisplayName("Nullpointer Exception Test")
    public void errorTest(){

        String actualResult = ArrayListDay.getDay(1);

        assertThrows(NullPointerException.class, () -> {ArrayListDay.getDay(null);});
    }

}




