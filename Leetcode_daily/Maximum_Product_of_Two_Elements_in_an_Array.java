package Leetcode_daily;

import java.util.Scanner;

public class Maximum_Product_of_Two_Elements_in_an_Array {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
       int res=0;
       int max=0;
       int second_max=Integer.MIN_VALUE;
       for(int i:nums){
           if(max<i){
               second_max=max;
               max=i;
           }
           else if(second_max<i){
               second_max=i;
           }
       }
       res=(max-1)*(second_max-1);

       return res;
    }
}
