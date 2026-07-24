package Striver_Blind_75_LeetCode_Problems.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Climbing_Stairs {
    static int [] dp=new int[46];
    static {
        Arrays.fill(dp,-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climbStairs(n));

    }
    public static int climbStairs(int n) {
        if (n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int one=0,two=0;
        if(n>=2){
            two=climbStairs(n-2);
        }
        if(n>=1){
            one=climbStairs(n-1);
        }
        return dp[n]=one+two;
    }
}
