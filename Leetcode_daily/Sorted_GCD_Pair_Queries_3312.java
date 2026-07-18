package Leetcode_daily;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted_GCD_Pair_Queries_3312 {
    public static void main(String args[]){
       int [] nums={2,3,4};
       long [] queries={0,2,2};
       int [] res=gcdValues(nums,queries);
       for(int i=0;i<res.length;i++){
           System.out.println(res[i]);
       }
    }
    public static int[] gcdValues(int[] nums, long[] queries) {
         int i=0;
         int j=i+1;
         List<Integer> list=new ArrayList<>();
         while(i<nums.length-1){
             list.add(gcd(nums[i],nums[j]));
             j++;
             if(j==nums.length){
                 i++;
                 j=i+1;
             }
         }
//         System.out.println(list);
        Collections.sort(list);
         int [] res=new int[queries.length];
         for(int k=0;k<queries.length;k++){
             res[k]=list.get((int)queries[k]);
         }

         return res;
    }

    public  static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);

    }
}
