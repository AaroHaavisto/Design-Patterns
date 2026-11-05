package Adapter;

public class Main {

    public static void main(String[] args) {

        NewDateInterface date = new CalendarToNewDateAdapter();

        date.setDay(5);
        date.setMonth(11);
        date.setYear(2026);

        System.out.println("Original date: " +
                date.getDay() + "." +
                date.getMonth() + "." +
                date.getYear());

        date.advanceDays(10);

        System.out.println("After 10 days: " +
                date.getDay() + "." +
                date.getMonth() + "." +
                date.getYear());

        date.advanceDays(20);

        System.out.println("After 20 more days: " +
                date.getDay() + "." +
                date.getMonth() + "." +
                date.getYear());
    }
}