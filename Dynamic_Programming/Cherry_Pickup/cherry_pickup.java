package Dynamic_Programming.Cherry_Pickup;

import java.util.*;

public class cherry_pickup {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(cherryPickup(arr));
    }
    static int [][][][] dp;
    public static int cherryPickup(int[][] grid) {
        int n=grid.length;
        dp=new int[n][n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    Arrays.fill(dp[i][j][k], -1);
                }
            }
        }
        return Math.max(0, helper(grid, grid.length, 0, 0, 0, 0));
    }

    public static int helper(int[][] grid, int n, int r1, int c1, int r2, int c2) {

        if (r1 >= n || c1 >= n || r2 >= n || c2 >= n ||
                grid[r1][c1] == -1 || grid[r2][c2] == -1) {
            return Integer.MIN_VALUE;
        }

        if (r1 == n - 1 && c1 == n - 1) {
            return grid[r1][c1];
        }
        if(dp[r1][c1][r2][c2]!=-1){
            return dp[r1][c1][r2][c2];
        }
        int cherry;

        if (r1 == r2 && c1 == c2) {
            cherry = grid[r1][c1];
        } else {
            cherry = grid[r1][c1] + grid[r2][c2];
        }

        int next = Math.max(
                Math.max(helper(grid, n, r1 + 1, c1, r2 + 1, c2),
                        helper(grid, n, r1 + 1, c1, r2, c2 + 1)),
                Math.max(helper(grid, n, r1, c1 + 1, r2 + 1, c2),
                        helper(grid, n, r1, c1 + 1, r2, c2 + 1))
        );

        if (next == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return dp[r1][c1][r2][c2]=cherry + next;
    }
}

// Convert Code into 3-D DP Instead of 4-D Dp   Code is in leetcode
// Question number 741

