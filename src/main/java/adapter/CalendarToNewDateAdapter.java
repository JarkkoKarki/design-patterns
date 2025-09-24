package adapter;

import java.util.Calendar;

// https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html
public class CalendarToNewDateAdapter implements NewDateInterface{
    private Calendar calendar;

    public CalendarToNewDateAdapter() {
        calendar = Calendar.getInstance();
        /*
        public static Calendar getInstance()
        Gets a calendar using the default time zone and locale. The Calendar returned is based on the current time in the default time zone with the default FORMAT locale.
        Returns:
        a Calendar.
        */

    }

    // void	set(int field, int value) Sets the given calendar field to the given value.
    @Override
    public void setDay(int day) {
        calendar.set(Calendar.DAY_OF_MONTH, day);
    }

    @Override
    public void setMonth(int month) {
        calendar.set(Calendar.MONTH, month - 1);
        /*
        set
        public final void set(int year,
                              int month,
                              int date)
        Sets the values for the calendar fields YEAR, MONTH, and DAY_OF_MONTH. Previous values of other calendar fields are retained. If this is not desired, call clear() first.
        Parameters:
        year - the value used to set the YEAR calendar field.
        *** month - the value used to set the MONTH calendar field. Month value is 0-based. e.g., 0 for January. ****
        date - the value used to set the DAY_OF_MONTH calendar field.
        See Also:
        set(int,int), set(int,int,int,int,int), set(int,int,int,int,int,int)
         */
    }

    @Override
    public void setYear(int year) {
        calendar.set(Calendar.YEAR, year);
    }

    @Override
    public int getDay() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public int getMonth() {
        return calendar.get(Calendar.MONTH) + 1;
    }

    @Override
    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    @Override
    public void advanceDays(int days) {
        calendar.add(Calendar.DAY_OF_MONTH, days);

        /*
        add
        public abstract void add(int field,
                                 int amount)
        Adds or subtracts the specified amount of time to the given calendar field, based on the calendar's rules. For example, to subtract 5 days from the current time of the calendar, you can achieve it by calling:
        add(Calendar.DAY_OF_MONTH, -5).

        Parameters:
        field - the calendar field.
        amount - the amount of date or time to be added to the field.
        See Also:
        roll(int,int), set(int,int)
         */
    }

    public String getDate() {
        return getDay() + "." + getMonth() + "." + getYear();
    }
}
