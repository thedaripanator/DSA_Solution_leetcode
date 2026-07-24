package Striver_Blind_75_LeetCode_Problems.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSubsequence {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String text1=sc.next();
        String text2=sc.next();
        System.out.println(lcs(text1,text2));
    }
    static int [][] dp;
    public static int lcs( String str1, String str2) {
       int n=str1.length();
       int m=str2.length();
       dp=new int[n+1][m+1];
       for(int i=0;i<=n;i++){
           Arrays.fill(dp[i],-1);
       }
       return helper(str1,str2,n,m);
    }
    public static int  helper(String str1,String str2,int n,int m){
        if(n==0 || m==0){
          return 0;
        }
        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        if(str1.charAt(n-1)==str2.charAt(m-1)){
            return  dp[n][m]=1+helper(str1,str2,n-1,m-1);
        }
        return dp[n][m]=Math.max(helper(str1,str2,n-1,m),helper(str1,str2,n,m-1));
    }
}
