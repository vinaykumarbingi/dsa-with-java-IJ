package com.vinay.Striver.step5.lec1;
//https://leetcode.com/problems/remove-outermost-parentheses/description/
public class L5RemoveOuterMostParenthasis {

    static String removeOuterParentheses(String S)
    {
        // Stores the resultant
        // string
        String res = "";

        // Stores the count of
        // opened parentheses
        int count = 0;

        // Traverse the string
        for (int c = 0;
             c < S.length(); c++)
        {
            // If opening parentheses is
            // encountered and their
            // count exceeds 0
            if (S.charAt(c) == '(' &&
                    count++ > 0)

                // Include the character
                res += S.charAt(c);

            // If closing parentheses is
            // encountered and their
            // count is less than count
            // of opening parentheses
            if (S.charAt(c) == ')' &&
                    count-- > 1)

                // Include the character
                res += S.charAt(c);
        }

        // Return the resultant string
        return res;
    }

//    another solution
        public static String removeOuterParentheses1(String s) {
            StringBuilder result = new StringBuilder();
            int opened = 0;

            for (char c : s.toCharArray()) {
                if ((c == '(' && opened++ > 0) ||
                        (c == ')' && opened-- > 1)) {
                    result.append(c);
                }
            }

            return result.toString();
        }

    // Driver Code
    public static void main(String[] args)
    {
        String S = "(()())(())()";
        System.out.print(removeOuterParentheses(S));
    }
}
