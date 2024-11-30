package com.vinay.D1_basic;

public class ArmStrongNumber {
    public static void main(String[] args) {
        // num = 153 , 1 cube + 5 cube + 3 cube = 153

        for (int i=100; i<1000; i++){
            int num = i;
            int tempNum = num;
            int sum=0;
            while (num >0){
                int rem = num % 10;
                sum +=rem*rem*rem;
                num /= 10;
            }
            if(tempNum == sum)
                System.out.println("armstrong number: "+i);
        }

    }
}
