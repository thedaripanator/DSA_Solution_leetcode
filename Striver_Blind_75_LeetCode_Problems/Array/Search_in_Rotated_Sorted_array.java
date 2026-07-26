package Striver_Blind_75_LeetCode_Problems.Array;

import java.util.Scanner;

public class Search_in_Rotated_Sorted_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(search(arr,target));
    }
    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target)
                return mid;

            if (nums[i] <= nums[mid]) {
                if (nums[i] <= target && target < nums[mid]) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[j]) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
        }

        return -1;
    }

}
