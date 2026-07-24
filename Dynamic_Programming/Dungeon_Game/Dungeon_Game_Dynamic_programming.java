package Dynamic_Programming.Dungeon_Game;

import java.util.Arrays;
import java.util.Scanner;

public class Dungeon_Game_Dynamic_programming {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] arr=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(calculateMinimumHP(arr));

    }
    static int m;
    static int n;
    static int [][] dp=new int [201][201];
    public static int calculateMinimumHP(int [][] arr){

        m=arr.length;
        n=arr[0].length;
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i],-1);
        }

        return solve(0,0,arr);
    }

    public static int solve(int i,int j,int [][] arr){
        if(i>=m || j>=n){
            return Integer.MAX_VALUE;
        }
        if(i==m-1 && j==n-1){
            return Math.max(1, 1 - arr[i][j]);
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=solve(i,j+1,arr);
        int down=solve(i+1,j,arr);

        int result = Math.min(right, down);

        if (result == Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return dp[i][j]=Math.max(1,result-arr[i][j]);

    }
}
