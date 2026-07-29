package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class Perfect_Squares {
    int min1=Integer.MAX_VALUE;
    static int [] dp;
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dp=new int [n];
        Arrays.fill(dp,-1);
        System.out.println(numSquares(n));
    }

    public static int numSquares(int n) {
        if(n==0){
            return 0;
        }
        int min1=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int result=1+numSquares(n-i*i);
            min1=Math.min(result,min1);
        }
        return min1;
    }
}
