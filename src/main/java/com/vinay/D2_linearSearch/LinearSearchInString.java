package com.vinay.D2_linearSearch;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name="vinay";
        char target  = 'a';
        boolean result = search(name,target);
        System.out.println(result);
        boolean result2 = searchForeach(name,target);
        System.out.println(result2);
//        System.out.println(name.toCharArray());
    }

    private static boolean search(String name, char target) {
        if(name.length() == 0)
            return false;

        for (int i=0;i<name.length();i++){
            if(target == name.charAt(i))
                return true;
        }
        return false;
    }

    private static boolean searchForeach(String name, char target) {
        if(name.length() == 0)
            return false;

        for(char c:name.toCharArray()){
            if(c==target)
                return true;
        }
        return false;
    }
}
