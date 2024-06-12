package se.lexicon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class OperationsUsingLocalDateTimeClass {
    public static void main(String[] args) {
        System.out.println("==================================================================");

        // Exercise 13
        // Create a LocalDateTime with the date and time components as: date: 2018-04-05,
        // time: 10.00
        System.out.println("EXERCISE 13:");
        LocalDate localDate = LocalDate.of(2018, 4, 5);
        LocalTime localTime = LocalTime.of(10, 0, 0, 9843584);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("LocalDateTime created using LocalDate and LocalTime of(): " + localDateTime);

        System.out.println("==================================================================");

        // Exercise 14
        // Using DateTimeFormatter format the LocalDateTime object from exercise 13 to a String
        // that should look like this: torsdag 5 april 10:00
        System.out.println("EXERCISE 14:");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE d MMMM HH:mm:ss.n");
        System.out.println(localDateTime.format(dateTimeFormatter));

        System.out.println("==================================================================");

        // Exercise 15
        // Create a LocalDateTime object by combining LocalDate object and LocalTime object.
        System.out.println("EXERCISE 15:");
        LocalDate localDate1 = LocalDate.parse("2018-04-05");
        LocalTime localTime1 = LocalTime.parse("10:00:00.9843584");
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);
        System.out.println("LocalDateTime created using LocalDate and LocalTime parse(): " + localDateTime1);

        System.out.println("==================================================================");

        // Exercise 16
        // Create a LocalDateTime object. Then get the LocalDate and LocalTime components into
        // separate objects of respective types from the LocalDateTime object.
        System.out.println("EXERCISE 16:");
        LocalDateTime localDateTime2 = LocalDateTime.now();
        LocalDate localDate2 = localDateTime2.toLocalDate();
        LocalTime localTime2 = localDateTime2.toLocalTime();
        System.out.println("LocalDateTime separated into LocalDate: " + localDate2);
        System.out.println("LocalDateTime separated into LocalTime: " + localTime2);

        System.out.println("==================================================================");
    }
}
