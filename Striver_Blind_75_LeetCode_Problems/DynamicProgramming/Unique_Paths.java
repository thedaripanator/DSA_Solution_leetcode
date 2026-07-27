package Striver_Blind_75_LeetCode_Problems.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Unique_Paths {
    static int[][] dp;

    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(uniquePaths(m, n));
    }

    public static int uniquePaths(int m, int n) {
        dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(m, n, 0, 0);
    }

    public static int helper(int m, int n, int i, int j) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int down = 0, right = 0;
        if (i < m) {
            down = helper(m, n, i + 1, j);
        }
        if (j < n) {
            right = helper(m, n, i, j + 1);
        }
        return dp[i][j] = down + right;
    }
}
