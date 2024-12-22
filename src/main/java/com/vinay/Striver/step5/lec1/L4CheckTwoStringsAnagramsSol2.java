package com.vinay.Striver.step5.lec1;
//https://takeuforward.org/data-structure/check-if-two-strings-are-anagrams-of-each-other/
public class L4CheckTwoStringsAnagramsSol2 {
    public static boolean checkAnagrams(String str1, String str2) {
        // when both of the strings have different lengths
        if (str1.length() != str2.length())
            return false;

        int[] freq = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'A']++;
        }
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'A']--;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(checkAnagrams(Str1, Str2));
    }
}
