package Leetcode_daily;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Maximum_Product_of_Three_Numbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maximumProduct(arr));
    }
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int prod1=nums[n-1]*nums[n-2]*nums[n-3];
        int prod2=nums[0]*nums[1]*nums[n-1];

        return Math.max(prod1,prod2);
    }
}
