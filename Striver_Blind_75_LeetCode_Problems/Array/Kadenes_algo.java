package Striver_Blind_75_LeetCode_Problems.Array;

import java.util.List;
import java.util.Scanner;

public class Kadenes_algo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(kadanes(arr));
    }
    public static int kadanes(int [] arr){
        int sum=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(sum,max);
        }
        return max;
    }
}
