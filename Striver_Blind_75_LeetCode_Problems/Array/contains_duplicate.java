package Striver_Blind_75_LeetCode_Problems.Array;

import java.util.*;

public class contains_duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> check=new HashSet<>();
        for(int i:nums){
            if(check.contains(i)){
                return true;
            }
            else{
                check.add(i);
            }
        }
        return false;
    }
}
