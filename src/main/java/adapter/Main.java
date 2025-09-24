package adapter;


public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();
        date.setDay(25);
        date.setMonth(9);
        date.setYear(2025);

        System.out.println("Date: " + ((CalendarToNewDateAdapter) date).getDate());
        date.advanceDays(10);
        System.out.println("After 10 days: " + ((CalendarToNewDateAdapter) date).getDate());

        date.advanceDays(40);
        System.out.println("After 40 days: " + ((CalendarToNewDateAdapter) date).getDate());

    }
}
