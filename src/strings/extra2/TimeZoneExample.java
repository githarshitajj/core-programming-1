package strings.extra2;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Get the current time in the system's default time zone
        ZonedDateTime now = ZonedDateTime.now();

        // Define the time zones
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        // Convert the current time to the specified time zones
        ZonedDateTime gmtTime = now.withZoneSameInstant(gmtZone);
        ZonedDateTime istTime = now.withZoneSameInstant(istZone);
        ZonedDateTime pstTime = now.withZoneSameInstant(pstZone);

        // Define a formatter for displaying the time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Display the times in different time zones
        System.out.println("Current time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current time in IST: " + istTime.format(formatter));
        System.out.println("Current time in PST: " + pstTime.format(formatter));
    }
}