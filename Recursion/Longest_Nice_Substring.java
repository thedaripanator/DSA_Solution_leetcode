package Recursion;

import java.util.*;

public class Longest_Nice_Substring {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longestNiceSubstring(str));
    }

    public static String longestNiceSubstring(String s) {
        if (s.length() < 2)
            return "";

        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (set.contains(Character.toUpperCase(c)) &&
                    set.contains(Character.toLowerCase(c))) {
                continue;
            }

            String str1 = longestNiceSubstring(s.substring(0, i));
            String str2 = longestNiceSubstring(s.substring(i + 1));

            return str1.length() >= str2.length() ? str1 : str2;
        }

        return s;
    }
}
