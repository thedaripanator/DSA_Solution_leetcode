package Dynamic_Programming.Best_time_to_buy_and_sell_stock;

import java.util.Arrays;
import java.util.Scanner;

public class Version_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxProfit(arr, k));
    }

    public static int maxProfit(int[] arr, int k) {
        int[][][] dp = new int[arr.length][2][k + 1];
        for(int [][] a:dp){
            for(int [] b:a){
                Arrays.fill(b,-1);
            }
        }
        return recursive(arr, 0, 1, k, dp);
    }

    public static int recursive(int[] arr, int day, int buy, int cap, int[][][] dp) {
        if (cap == 0) {
            return 0;
        }
        if (day == arr.length) {
            return 0;
        }
        if (dp[day][buy][cap] != -1) {
            return dp[day][buy][cap];
        }
        if (buy == 1) {
            return dp[day][buy][cap] = Math.max(-arr[day] + recursive(arr, day + 1, 0, cap, dp), recursive(arr, day + 1, 1, cap, dp));
        } else
            return dp[day][buy][cap] = Math.max(arr[day] + recursive(arr, day + 1, 1, cap - 1, dp), recursive(arr, day + 1, 0, cap, dp));
    }
}
