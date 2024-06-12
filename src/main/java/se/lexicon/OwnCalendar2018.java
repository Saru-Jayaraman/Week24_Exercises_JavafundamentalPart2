package se.lexicon;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class OwnCalendar2018 {
    public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = simpleDateFormat.parse("2018-01-01");
        // Extra challange
        // Create your own calendar for the year 2018.
        System.out.println("==================================================================");
        System.out.println("EXTRA CHALLENGE:");
        LocalDate localDate = LocalDate.parse("2018-02-28");
        Date date = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Calendar for the " + year + " details:");

        int numberOfDays = calendar.get(Calendar.DAY_OF_YEAR);
        Period period1 = Period.ofDays(numberOfDays-1);
        LocalDate localDate1 = localDate.minusDays(period1.getDays());
        calendar.setTime(Date.from(localDate1.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        System.out.println("Least day in this Year: " + calendar.getTime());

        int maxNumberOfDays = calendar.getMaximum(Calendar.DAY_OF_YEAR);
        Period period2 = Period.ofDays(maxNumberOfDays-numberOfDays-1);
        LocalDate localDate2 = localDate.plusDays(period2.getDays());
        calendar.setTime(Date.from(localDate2.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
        System.out.println("Last day in this Year: " + calendar.getTime());
        System.out.println("==================================================================");
    }
}
