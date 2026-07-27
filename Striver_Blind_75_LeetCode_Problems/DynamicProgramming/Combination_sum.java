package Striver_Blind_75_LeetCode_Problems.DynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination_sum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(combinationSum(arr,target));
    }
    public static List<List<Integer>>  combinationSum(int[] candidates, int target) {
         List<List<Integer>> res=new ArrayList<>();
          helper(candidates,target,0,res,new ArrayList<>());
          return res;
    }
    public static void helper(int [] arr,int target,int index,List<List<Integer>> res,List<Integer> current){
        if(target==0){
            res.add(new ArrayList<>(current));
            return;
        }
        if(index==arr.length){
            return ;
        }
        if(target<0){
            return ;
        }
        current.add(arr[index]);
        helper(arr,target-arr[index],index,res,current);
        current.remove(current.size()-1);
        helper(arr,target,index+1,res,current);

    }
}
