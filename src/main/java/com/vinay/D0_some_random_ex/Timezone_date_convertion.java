package com.vinay.D0_some_random_ex;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Timezone_date_convertion {
    public static void main(String[] args) {
        LocalDateTime fixedDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + fixedDateTime);

        // Define time zones for two locations in the United States

//        ZoneId zone1 = ZoneId.of("America/New_York");
//        ZoneId zone2 = ZoneId.of("America/Los_Angeles");

//        ZoneId zone1 = ZoneId.of("America/Los_Angeles");
//        ZoneId zone2 = ZoneId.of("America/New_York");

//         ZoneId zone1 = ZoneId.of("America/New_York");
//         ZoneId zone2 = ZoneId.of("America/New_York");

//         ZoneId zone1 = ZoneId.of("America/Los_Angeles");
//         ZoneId zone2 = ZoneId.of("America/Los_Angeles");

//        ZoneId zone1 = ZoneId.of("America/Los_Angeles");
//        ZoneId zone2 = ZoneId.of("America/Denver");

//        ZoneId zone1 = ZoneId.of("America/Denver");
//        ZoneId zone2 = ZoneId.of("America/Los_Angeles");

//        ZoneId zone1 = ZoneId.of("America/Chicago");
//        ZoneId zone2 = ZoneId.of("America/Los_Angeles");

        ZoneId zone1 = ZoneId.of("America/Los_Angeles");
        ZoneId zone2 = ZoneId.of("America/Chicago");

        // Get the specified date and time in each time zone
        ZonedDateTime dateTime1 = ZonedDateTime.of(fixedDateTime, zone1);
        ZonedDateTime dateTime2 = ZonedDateTime.of(fixedDateTime, zone2);

        // Calculate the time difference between the two time zones
        Duration duration = Duration.between(dateTime1, dateTime2);

        // Print the time difference in hours
        long hours = Math.abs(duration.toHours());
        System.out.println("Time difference between " + zone1 + " and " + zone2 + " is " + hours + " hours.");

        if(hours > 0 && duration.toHours() > 0 && !duration.isNegative()){
            String inputDateTimeString = "2023-11-06 10:00";

            // Parse the input string to LocalDateTime
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime localDateTime = LocalDateTime.parse(inputDateTimeString, formatter);

            // Convert LocalDateTime to ZonedDateTime with the specified timezone (America/New_York)
            ZoneId zoneId = ZoneId.of("America/New_York");
            ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

            // Subtract a variable number of hours (in this case, 3 hours)
//            long hoursToSubtract = 3;
            ZonedDateTime resultZonedDateTime = zonedDateTime.minusHours(hours);

            // Print the result
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            System.out.println("Original DateTime: " + zonedDateTime.format(outputFormatter));
            System.out.println("DateTime after subtracting " + hours + " hours: " + resultZonedDateTime.format(outputFormatter));
        }else if(hours > 0 && duration.toHours() < 0 && duration.isNegative()){
            String inputDateTimeString = "2023-11-06 10:00";

            // Parse the input string to LocalDateTime
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime localDateTime = LocalDateTime.parse(inputDateTimeString, formatter);

            // Convert LocalDateTime to ZonedDateTime with the specified timezone (America/New_York)
            ZoneId zoneId = ZoneId.of("America/New_York");
            ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);

            // Subtract a variable number of hours (in this case, 3 hours)
//            long hoursToSubtract = 3;
            ZonedDateTime resultZonedDateTime = zonedDateTime.plusHours(hours);

            // Print the result
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            System.out.println("Original DateTime: " + zonedDateTime.format(outputFormatter));
            System.out.println("DateTime after subtracting " + hours + " hours: " + resultZonedDateTime.format(outputFormatter));
        }
    }
}
