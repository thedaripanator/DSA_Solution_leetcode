package Striver_Blind_75_LeetCode_Problems.DynamicProgramming;

import java.util.Scanner;

public class Coins_II {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(change(amount,arr));
    }

    public static int change(int amount, int[] arr) {
        int n = arr.length;
        return helper(arr, amount, n);
    }

    public static int helper(int[] arr, int amount, int n) {
        if ( amount == 0) {
            return 1;
        }
        if(n==0){
            return 0;
        }
        if (arr[n - 1] <=amount) {
            return helper(arr, amount - arr[n - 1], n)+ helper(arr, amount, n - 1);
        } else {
            return helper(arr, amount, n - 1);
        }

    }
}
