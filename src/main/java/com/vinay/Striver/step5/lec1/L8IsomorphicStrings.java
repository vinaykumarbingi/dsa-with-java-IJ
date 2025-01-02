package com.vinay.Striver.step5.lec1;

import java.util.HashMap;

//https://leetcode.com/problems/isomorphic-strings/description/
public class L8IsomorphicStrings {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2= "add";
        System.out.println(isIsomorphic(str1,str2));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> charIndexS = new HashMap<>();
        HashMap<Character, Integer> charIndexT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!charIndexS.containsKey(s.charAt(i))) {
                charIndexS.put(s.charAt(i), i);
            }

            if (!charIndexT.containsKey(t.charAt(i))) {
                charIndexT.put(t.charAt(i), i);
            }

            if (!charIndexS.get(s.charAt(i)).equals(charIndexT.get(t.charAt(i)))) {
                return false;
            }
        }

        return true;
    }
}
