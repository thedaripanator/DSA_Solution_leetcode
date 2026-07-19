package Dynamic_Programming.Best_time_to_buy_and_sell_stock;

import java.util.Scanner;

public class Version_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(profit(arr));
    }
    public static int profit(int [] nums){
        int buy=nums[0];
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<buy){
                buy=nums[i];
            }
            else{
                 max=Math.max(max,nums[i]-buy);
            }
        }
        return max;
    }
}
