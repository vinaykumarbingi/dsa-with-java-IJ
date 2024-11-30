package com.vinay.D0_some_random_ex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
        String dateStr = "2023-10-24";

        // Parse the input date string
        LocalDate date = LocalDate.parse(dateStr);

        // Format the date in the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(formatter);

        System.out.println("Original date string: " + dateStr);
        System.out.println("Formatted date string: " + formattedDate);
    }
}
