package adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalendarToNewDateAdapterTest {

    private NewDateInterface date;

    @Before
    public void setUp() {
        date = new CalendarToNewDateAdapter();
        date.setDay(25);
        date.setMonth(9);
        date.setYear(2025);
    }

    @Test
    public void testAdvanceDaysForward() {
        date.advanceDays(10);
        assertEquals(5, date.getDay());
        assertEquals(10, date.getMonth());
        assertEquals(2025, date.getYear());
    }

    @Test
    public void testAdvanceDaysCrossMonth() {
        date.advanceDays(40);
        assertEquals(4, date.getDay());
        assertEquals(11, date.getMonth());
        assertEquals(2025, date.getYear());
    }

    @Test
    public void testAdvanceDaysBackward() {
        date.advanceDays(-30);
        assertEquals(26, date.getDay());
        assertEquals(8, date.getMonth());
        assertEquals(2025, date.getYear());
    }
}