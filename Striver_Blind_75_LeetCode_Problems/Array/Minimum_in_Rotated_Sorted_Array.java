package Striver_Blind_75_LeetCode_Problems.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_in_Rotated_Sorted_Array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr));
    }

    public static int findMinBrute(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            min = Math.min(min, i);
        }
        return min;
    }


    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }
}
