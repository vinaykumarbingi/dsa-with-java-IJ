package com.vinay.D12_recursion_3;

public class D3_skip_a_string {
    public static void main(String[] args) {
        System.out.println(skipWord("baccappledah"));
        System.out.println(skipAppNotApple("baccappledahappl"));
    }

    static  String skipWord(String up){
        if(up.isEmpty()){
            return "";
        }

//        char ch = up.charAt(0);

        if(up.startsWith("apple")){
            return skipWord(up.substring(5));
        }else{
            return up.charAt(0)+skipWord(up.substring(1));
        }
    }

    static  String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

//        char ch = up.charAt(0);

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }
    }
}
