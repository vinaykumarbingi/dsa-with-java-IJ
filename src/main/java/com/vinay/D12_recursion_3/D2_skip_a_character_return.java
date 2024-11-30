package com.vinay.D12_recursion_3;

public class D2_skip_a_character_return {
    public static void main(String[] args) {
        System.out.println(skip("baccdah"));
    }

    static  String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch=='a'){
            return skip(up.substring(1));
        }else{
            return ch+skip(up.substring(1));
        }
    }
}
