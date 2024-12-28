package com.vinay.Striver.step5.lec1;

import java.util.Stack;

//https://takeuforward.org/data-structure/reverse-words-in-a-string/
public class L1ReverseWordsInSentenceSol1 {
    public static void main(String[] args)
    {
        String s = "TUF is great for interview preparation";
        System.out.println("Before reversing words: ");
        System.out.println(s);
        s += " ";
        Stack<String> st = new Stack<String>();
        int i;
        String str = "";
        for (i = 0;i < s.length();i++)
        {
            if (s.charAt(i) == ' ')
            {
                st.push(str);
                str = "";
            }
            else
            {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1)
        {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek(); // The last word should'nt have a space after it
        System.out.println("After reversing words: ");
        System.out.print(ans);
    }
}