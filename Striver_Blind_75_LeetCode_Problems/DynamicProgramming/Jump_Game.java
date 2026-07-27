package Striver_Blind_75_LeetCode_Problems.DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Jump_Game {
    static  int [] dp;
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(canJump(arr));
    }
    public static boolean canJump(int [] nums){
        dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return helper(nums,0);
    }
    public static boolean helper(int [] nums,int index) {
        if (index >= nums.length - 1) {
            return true;
        }
        if(dp[index]!=-1){
            return dp[index]==1;
        }

        for (int jump = 1; jump <= nums[index]; jump++) {
            if (helper(nums, index + jump)) {
                return true;
            }
        }
        dp[index]=0;
        return false;
    }
}
