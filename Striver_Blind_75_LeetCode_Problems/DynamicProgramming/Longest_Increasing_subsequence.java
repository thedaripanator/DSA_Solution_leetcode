package Striver_Blind_75_LeetCode_Problems.DynamicProgramming;

import java.util.Scanner;

public class Longest_Increasing_subsequence {
    static int max=0;
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(LIS(arr));
    }
    public static int LIS(int[] nums) {
       return helper(nums,0,-1);
    }
    public static int  helper(int [] arr,int index,int preIndex){
        if(index==arr.length){
            return 0;
        }
        int nottake=helper(arr,index+1,preIndex);
        int take=0;
        if(preIndex==-1 || arr[index]>arr[preIndex]){
            take=1+helper(arr,index+1,index);
        }
        return Math.max(take,nottake);
    }
}
