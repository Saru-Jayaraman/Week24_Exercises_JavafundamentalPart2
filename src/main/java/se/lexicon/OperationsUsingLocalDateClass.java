package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class OperationsUsingLocalDateClass {
    public static void main(String[] args) {
        System.out.println("==================================================================");

        // Exercise 1:
        // Create a LocalDate of the current day and print it out
        System.out.println("EXERCISE 1:");
        LocalDate localDate = LocalDate.now();
        System.out.println("Current Date using now(): " + localDate);

        System.out.println("==================================================================");

        // Exercise2:
        // Create a LocalDate of the current day and print it out in the following pattern using
        // DateTimeFormatter: Torsdag 29 mars.
        System.out.println("EXERCISE 2:");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE dd MMMM");
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("Formatted Date: " + formattedDate);

        System.out.println("==================================================================");

        // Exercise3:
        // Create a LocalDate of last Monday. Then print out the entire week in a loop using
        // standard ISO format.
        System.out.println("EXERCISE 3:");
        LocalDate localDate1 = LocalDate.of(2024, 6,3);
        System.out.println("Printing entire week:");
        System.out.println(localDate1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        for(int i=0 ; i<6; i++) {
            localDate1 = localDate1.plusDays(1);
            System.out.println(localDate1.format(DateTimeFormatter.ISO_LOCAL_DATE));
        }

        System.out.println("==================================================================");

        // Exercise 4:
        // Create a LocalDate object from a String by using the .parse() method.
        System.out.println("EXERCISE 4:");
        LocalDate localDate2 = LocalDate.parse("2024-06-07");
        System.out.println("Current Date using parse(): " + localDate2);

        System.out.println("==================================================================");

        // Exercise5
        // The date time api provides enums for time units such as day and month. Create a
        // LocalDate of your birthday and extract the day of week for that date.
        // Ex. 1945-05-08 -> TUESDAY
        System.out.println("EXERCISE 5:");
        LocalDate localDate3 = LocalDate.parse("1992-10-15");
        System.out.println("Day of week for my birthday(1992-10-15): " + localDate3.getDayOfWeek());

        System.out.println("==================================================================");

        // Exercise6
        // Create a LocalDate of current date plus 10 years and minus 10 months. From that date
        // extract the month and print it out.
        System.out.println("EXERCISE 6:");
        LocalDate localDate4 = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println("Current date+10years-Minus 10months: " + localDate4.getMonth());

        System.out.println("==================================================================");

        // Exercise7
        // Using the LocalDate from exercise 6 and your birthdate, create a Period between your
        // birthdate and the date from exercise 5. Print out the elapsed years, months and days.
        System.out.println("EXERCISE 7:");
        Period period = Period.between(localDate3, localDate4);
        System.out.println("Period between My Birthday and Current Date+10years-10months:");
        System.out.println("Elapsed years: " + period.getYears());
        System.out.println("Elapsed months: " + period.getMonths());
        System.out.println("Elapsed days: " + period.getDays());

        System.out.println("==================================================================");

        // Exercise 8
        //Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of
        // current date and add the period you created to the current date.
        System.out.println("EXERCISE 8:");
        Period period1 = Period.of(4, 7, 29);
        LocalDate localDate5 = LocalDate.now();

        LocalDate localDate6 = localDate5.plusYears(period1.getYears())
                .plusMonths(period1.getMonths())
                .plusDays(period1.getDays());
        System.out.println("Current date+4years 7 months 29 days: " + localDate6);
//        OR
        LocalDate localDate7 = LocalDate.of(4, 7, 29);
        LocalDate localDate8 = localDate5.plusYears(localDate7.getYear())
                .plusMonths(localDate7.getMonthValue()).plusDays(localDate7.getDayOfMonth());
        System.out.println("Current date+4years 7 months 29 days: " + localDate8);

        System.out.println("==================================================================");
    }
}