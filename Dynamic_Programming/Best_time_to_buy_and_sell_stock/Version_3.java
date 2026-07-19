package Dynamic_Programming.Best_time_to_buy_and_sell_stock;

import java.util.*;

public class Version_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProfit1(arr));
    }
    public static int maxProfit(int [] arr){
        int [][][] dp=new int[arr.length][2][3];
        for(int [][] a:dp){
            for(int [] b:a){
                Arrays.fill(b,-1);
            }
        }
        return recursive(arr,0,1,2,dp);
    }
    public static int recursive(int [] arr,int day,int buy,int cap,int [][][] dp){
        if(cap==0){
            return 0;
        }
        if(day==arr.length){
            return 0;
        }
        if(dp[day][buy][cap]!=-1){
            return dp[day][buy][cap];
        }
        if(buy==1){
            return dp[day][buy][cap]=Math.max(-arr[day]+recursive(arr,day+1,0,cap,dp), recursive(arr, day + 1, 1, cap,dp));
        }
        else{
            return dp[day][buy][cap]=Math.max(arr[day]+recursive(arr,day+1,1,cap-1,dp), recursive(arr, day + 1, 0, cap,dp));
        }
    }
    // Bottom up approach
    public static int maxProfit1(int [] arr){
        int n = arr.length;

        int[][][] dp = new int[n + 1][2][3];

        for (int day = n - 1; day >= 0; day--) {
            for (int buy = 0; buy <= 1; buy++) {
                for (int cap = 1; cap <= 2; cap++) {

                    if (buy == 1) {
                        dp[day][buy][cap] = Math.max(
                                -arr[day] + dp[day + 1][0][cap],
                                dp[day + 1][1][cap]
                        );
                    } else {
                        dp[day][buy][cap] = Math.max(
                                arr[day] + dp[day + 1][1][cap - 1],
                                dp[day + 1][0][cap]
                        );
                    }
                }
            }
        }

        return dp[0][1][2];
    }
}
