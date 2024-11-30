package com.vinay.D0_some_random_ex;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OrderIdGenerator {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format the date and time part
        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));

        // Format the nine-digit number part
        String formattedCounter = String.format("%09d", 88);

        // Increment the order counter for the next order
//        orderCounter++;

        // Combine the date/time and number parts to form the order ID

        System.out.println(formattedDateTime + formattedCounter);
    }
}
