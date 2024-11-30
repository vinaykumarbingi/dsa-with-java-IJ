package com.vinay.D12_recursion_3;

import java.util.ArrayList;

public class D4_subsequence {
    public static void main(String[] args) {
        subseq("","abc");
        System.out.println(subseqReturn("","abc"));
        System.out.println(subseqAsciiReturn("","abc"));
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        subseq(p+c, up.substring(1));
        subseq(p,up.substring(1));
    }

    static ArrayList<String> subseqReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);
        ArrayList<String> left =  subseqReturn(p+c, up.substring(1));
        ArrayList<String> right = subseqReturn(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    static ArrayList<String> subseqAsciiReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char c = up.charAt(0);
        ArrayList<String> first =  subseqAsciiReturn(p+c, up.substring(1));
        ArrayList<String> second = subseqAsciiReturn(p,up.substring(1));
        ArrayList<String> third = subseqAsciiReturn(p+(c+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
