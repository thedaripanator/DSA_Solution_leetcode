package Dynamic_Programming;

import java.util.Scanner;

public class MinimumFallingPathSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(minFallingPathSum(arr));
    }
    public static int minFallingPathSum(int[][] matrix) {
         // Finding the min value in the first row
        int min=Integer.MAX_VALUE;
        int index = 0;
        for(int j=0;j<matrix[0].length;j++){
            min=Math.min(min,helper(0,j,matrix.length,matrix));
        }
        return min;
    }
    public static int  helper(int i,int j,int n,int[][] grid){
        if(i>=n || j>=n || j<0){
            return Integer.MAX_VALUE;
        }
        if(i==n-1){
            return grid[i][j];
        }
        int down=helper(i+1,j,n,grid);
        int diagonal=Math.min(helper(i+1,j+1,n,grid),helper(i+1,j-1,n,grid));
        int ans=Math.min(down,diagonal);
        if(ans==Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return grid[i][j]+Math.min(down,diagonal);


    }
}
