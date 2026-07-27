package Striver_Blind_75_LeetCode_Problems.String;

import java.util.Scanner;

public class Palindrome_Number {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
       String str=Integer.toString(x);
       String res="";
       for(int i=str.length()-1;i>=0;i--){
           res+=str.charAt(i);
       }
       if(res.equals(str)){
           return true;
       }
       return false;
    }
}
