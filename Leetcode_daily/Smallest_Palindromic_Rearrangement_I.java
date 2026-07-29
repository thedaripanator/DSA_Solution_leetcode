package Leetcode_daily;

import java.util.Arrays;
import java.util.Scanner;

public class Smallest_Palindromic_Rearrangement_I {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(smallestPalindrome(str));
    }

    public static String smallestPalindrome(String s) {
        String res = "";
        int i = 0;
        int j = s.length() - 1;
        int mid = (i + j) / 2;
        char[] arr = s.toCharArray();
        if (mid == 0) {
            return s;
        }
        String first = "";
        String last = "";
        if (s.length() % 2 == 0) {
            first = s.substring(0, mid + 1);
            char[] temp = first.toCharArray();
            Arrays.sort(temp);
            res = String.valueOf(temp) + String.valueOf(new StringBuilder(String.valueOf(temp)).reverse().toString());

        } else {
            first = s.substring(0, mid);
            char[] temp = first.toCharArray();
            Arrays.sort(temp);
            res = String.valueOf(temp) + s.charAt(mid) + String.valueOf(new StringBuilder(String.valueOf(temp)).reverse().toString());
        }
        return res;
    }
}
