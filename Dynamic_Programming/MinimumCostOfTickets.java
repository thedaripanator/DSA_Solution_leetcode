package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCostOfTickets {
    static  int [] dp;
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int [] cost=new int[3];
        for(int i=0;i<3;i++){
            cost[i]=sc.nextInt();
        }
        System.out.println(mincostTickets(arr,cost));
    }
    public static int mincostTickets(int[] days, int[] costs) {
        dp=new int[days.length];
        Arrays.fill(dp,-1);
        return solve(days,costs,0);
    }
    public static int solve(int [] days,int [] costs,int index){
        if(index>=days.length){
            return 0;
        }

        if(dp[index]!=-1){
            return dp[index];
        }

        // One day Travel
        int cost1= costs[0]+solve(days,costs,index+1);


        // 7 Day Travel
        int nextday=days[index]+7;
        int j=index;
        while(j<days.length && days[j]<nextday){
            j++;
        }
        int cost7=costs[1]+solve(days,costs,j);

        // 30Day Travel

        int nextday1=days[index]+30;
        int k=index;
        while(k<days.length && days[k]<nextday1){
            k++;
        }
        int cost30=costs[2]+solve(days,costs,k);

        return dp[index]=Math.min(cost1,Math.min(cost7,cost30));
    }
}
