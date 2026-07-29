package Dynamic_Programming.Cherry_Pickup;

import java.util.*;

public class Cherry_Pickup_II {
    static int [][][] dp;
    static void main() {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(bottom_up(m,n,arr));

    }
    public static int cherryPickup(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        dp = new int[r + 1][c + 1][c + 1];
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= c; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return f(0, 0, c - 1, r, c, grid);
    }

    public static int f(int i, int j1, int j2, int r, int c, int[][] grid) {
        if (j1 < 0 || j2 < 0 || j2 >= c || j1 >= c) {
            return Integer.MIN_VALUE;
        }
        if (i == r - 1) {
            if (j1 == j2) {
                return grid[i][j1];
            } else {
                return grid[i][j1] + grid[i][j2];
            }
        }
        if (dp[i][j1][j2] != -1) {
            return dp[i][j1][j2];
        }
        int max = Integer.MIN_VALUE;
        for (int dj1 = -1; dj1 <= +1; dj1++) {
            for (int dj2 = -1; dj2 <= +1; dj2++) {
                int value = 0;
                if (j1 == j2)
                    value = grid[i][j1];
                else {
                    value = grid[i][j1] + grid[i][j2];
                }
                value += f(i + 1, j1 + dj1, j2 + dj2, r, c, grid);
                max = Math.max(value, max);
            }
        }
        return dp[i][j1][j2] = max;
    }
    public static int bottom_up(int n,int m,int [][] grid){
        int [][][] dp1=new int[n][m][m];
        for(int j1=0;j1<m;j1++){
            for(int j2=0;j2<m;j2++){
                if(j1==j2) dp1[n-1][j1][j2]=grid[n-1][j1];
                else{
                    dp1[n-1][j1][j2]=grid[n-1][j1]+grid[n-1][j2];
                }
            }
        }

        for(int i=n-2;i>=0;i--){
            for(int j1=0;j1<m;j1++){
                for(int j2=0;j2<m;j2++){
                    int maxi = Integer.MIN_VALUE;
                    for (int dj1 = -1; dj1 <= +1; dj1++) {
                        for (int dj2 = -1; dj2 <= +1; dj2++) {
                            int value = 0;
                            if (j1 == j2)
                                value = grid[i][j1];
                            else {
                                value = grid[i][j1] + grid[i][j2];
                            }
                            if(j1 + dj1>=0 && j1 + dj1<m && j2 + dj2>=0 && j2 + dj2<m)
                             value += dp1[i + 1][j1 + dj1][j2 + dj2];
                            else
                                value=Integer.MIN_VALUE;
                            maxi = Math.max(value, maxi);
                        }
                    }
                    dp1[i][j1][j2]=maxi;
                }
            }
        }
        return dp1[0][0][m-1];
    }


}
