package Leetcode_daily;

import java.util.*;

public class Smalles_Subsequence_of_Distinct_Characters_1081_316 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(removeDuplicateLetters(str));

    }
    public static  String removeDuplicateLetters(String s) {

        int freq[] = new int[26];
        boolean visited[] = new boolean[26];


        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);


            freq[ch - 'a']--;


            if(visited[ch - 'a'])
                continue;

            while(!st.isEmpty() &&
                    st.peek() > ch &&
                    freq[st.peek() - 'a'] > 0) {

                visited[st.pop() - 'a'] = false;
            }

            st.push(ch);
            visited[ch - 'a'] = true;
        }


        StringBuilder res = new StringBuilder();

        for(char c : st)
            res.append(c);

        return res.toString();
    }
}
