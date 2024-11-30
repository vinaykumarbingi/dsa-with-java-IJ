package com.vinay.D1_basic;

public class NumberOccurance {
    public static void main(String[] args) {
//        number = 34578785577 , how many time 7 digit repeated in number
        int number= 2125282121;
        //2 digit count
        int digit = 2;
        int count =0;
        while (number > 0){
            int rem = number % 10;
            number = number / 10;
            if(rem == digit)
                count++;
        }
        System.out.println(count);
    }
}
