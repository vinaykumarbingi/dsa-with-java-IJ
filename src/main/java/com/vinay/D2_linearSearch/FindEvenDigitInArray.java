package com.vinay.D2_linearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindEvenDigitInArray {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,-7896};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] arr){
        int count = 0;

        for (int number: arr){
            if(evenDigitNumber(number))
                count++;
        }
        return count;
    }
    static boolean evenDigitNumber(int number){

        //convert negative no to positive no
        if(number < 0){
            number = number * -1;
        }
        int count = 0;
        while (number > 0){
            count++;
            number = number / 10;
        }
        return count %2 == 0;
    }
}
