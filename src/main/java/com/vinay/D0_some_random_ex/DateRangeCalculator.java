package com.vinay.D0_some_random_ex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateRangeCalculator {
    public static void main(String[] args) {
        int monthCount = 3;
        DateRange dateRange = getDateRange(monthCount);
        System.out.println("From: " + dateRange.getFrom() + ", To: " + dateRange.getTo());
    }

    static DateRange getDateRange(int monthCount) {
        LocalDate currentDate = LocalDate.now();
        // Set the day of the month to 1 to get the first day of the current month
        LocalDate firstDayOfMonth = LocalDate.of(currentDate.getYear(), currentDate.getMonthValue(), 1);
        // Calculate the last day of the month
        LocalDate lastDayOfMonth = firstDayOfMonth.plusMonths(1).minusDays(1);

        // Calculate the end date based on monthCount
        LocalDate endDate = lastDayOfMonth.plusMonths(monthCount - 1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        return new DateRange(
                firstDayOfMonth.format(formatter),
                endDate.format(formatter)
        );
    }

    static class DateRange {
        private final String from;
        private final String to;

        public DateRange(String from, String to) {
            this.from = from;
            this.to = to;
        }

        public String getFrom() {
            return from;
        }

        public String getTo() {
            return to;
        }
    }
}
