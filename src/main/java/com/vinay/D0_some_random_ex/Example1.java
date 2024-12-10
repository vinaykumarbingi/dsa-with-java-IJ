package com.vinay.D0_some_random_ex;

public class Example1 {
    public static void main(String[] args) {
//        String str = "2024-12-18 17:00";
        String str = "2024-12-18";
        System.out.println(str);
//        String updatedStartDateTime = str.substring(0, 8) + "08" + str.substring(10);
        String updatedStartDateTime = str.substring(0, str.length() - 2) + "08";
        System.out.println(updatedStartDateTime);
    }
}
