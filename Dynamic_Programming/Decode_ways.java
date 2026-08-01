package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Decode_ways {
    static int [] dp;
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(numDecodings(str));
    }
    public static  int numDecodings(String s){
        int n=s.length();
        dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(0,s,n);
    }
    public static int solve(int i,String s,int n){
        if(i>=n){
            return 1;
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int res=solve(i+1,s,n);
        if(i+1 < n) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) <= '6')) {
                res += solve(i + 2, s, n);
            }
        }
        return dp[i]=res;
    }
}
