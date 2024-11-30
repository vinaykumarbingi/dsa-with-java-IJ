package com.vinay.D1_basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.println("enter operator: ");
            char c = sc.next().trim().charAt(0);
            if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%' ){
                System.out.println("enter two values");
                int a= sc.nextInt();
                int b= sc.nextInt();
                if(c=='+')
                    ans = a+b;
                if(c=='-')
                    ans = a-b;
                if(c=='*')
                    ans = a*b;
                if(c=='/')
                    ans = a/b;
                if(c=='%')
                    ans = a%b;
            }else if(c== 'x'){
                break;
            }else{
                System.out.println("enter valid operator");
            }
            System.out.println(ans);
        }
    }
}
