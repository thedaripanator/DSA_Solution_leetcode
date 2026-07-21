package Striver_Blind_75_LeetCode_Problems.Array;

import java.util.HashMap;
import java.util.Scanner;

public class Two_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int [] res=twoSum(arr,target);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static  int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int impl=target-nums[i];
            if(map.containsKey(impl)){
                return new int[]{map.get(impl),i};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
