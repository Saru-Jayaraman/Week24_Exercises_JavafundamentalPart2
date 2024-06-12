package se.lexicon;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class OperationsUsingLocalTimeClass {
    public static void main(String[] args) {
        System.out.println("==================================================================");

        // Exercise 9
        // Create a LocalTime object of the current time.
        System.out.println("EXERCISE 9:");
        LocalTime localTime = LocalTime.now();
        System.out.println("Current Time using now(): " + localTime);

        System.out.println("==================================================================");

        // Exercise 10
        // Extract the nanoseconds of a LocalTime object of current time.
        // Print out the nanoseconds.
        System.out.println("EXERCISE 10:");
        System.out.println("Nanoseconds of Current time: " + localTime.getNano());

        System.out.println("==================================================================");

        // Exercise 11
        // Create a LocalTime object from a String using the .parse() method.
        System.out.println("EXERCISE 11:");
        LocalTime localTime1 = LocalTime.parse("15:10:14.454344233");
        System.out.println("Current Time using parse(): " + localTime1);

        System.out.println("==================================================================");

        // Exercise 12
        // Using DateTimeFormatter format LocalTime from current time and print it out as following
        // pattern: 10:32:53
        System.out.println("EXERCISE 12:");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = localTime.format(dateTimeFormatter);
        System.out.println("Formatted Time: " + formattedTime);

        System.out.println("==================================================================");
    }
}
