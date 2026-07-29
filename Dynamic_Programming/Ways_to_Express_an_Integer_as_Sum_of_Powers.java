package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Ways_to_Express_an_Integer_as_Sum_of_Powers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(numberOfWays(n,x));
    }
    public static int [][] dp;
    public static int numberOfWays(int n, int x){
        dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(n,x,1);
    }

    public static int helper(int n,int x,int start){
        if(n==0){
            return 1;
        }
        if(dp[n][start]!=-1){
            return dp[n][start];
        }
        int ways=0;
        for(int i=start;Math.pow(i,x)<=n;i++){
            ways+=helper(n-(int)Math.pow(i,x),x,i+1);
        }
        return dp[n][start]=ways;
    }
}
