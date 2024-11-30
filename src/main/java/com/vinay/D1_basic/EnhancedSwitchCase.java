package com.vinay.D1_basic;

import java.util.Scanner;

public class EnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String fruit = sc.next();

//        switch (fruit){
//            case "apple":
//                System.out.println("it is apple");
//                break;
//            case "mango":
//                System.out.println("it is mango");
//                break;
//            default:
//                System.out.println("please enter apple or mango");
//        }

        switch (fruit) {
            case "apple" -> System.out.println("it is apple");
            case "mango" -> System.out.println("it is mango");
            default -> System.out.println("please enter apple or mango");
        }

        //weeks
        int day = 5;
        switch (day){
            case 1,2,3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("weekend");
        }
    }
}
