package Dynamic_Programming.Best_time_to_buy_and_sell_stock;

import java.util.Scanner;

public class Version_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(profit(arr));
    }
    public static int  profit(int[] arr){
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }
}
