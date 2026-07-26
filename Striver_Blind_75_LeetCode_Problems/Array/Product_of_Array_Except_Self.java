package Striver_Blind_75_LeetCode_Problems.Array;

import java.util.Scanner;

public class Product_of_Array_Except_Self {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = productExceptSelf(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] productExceptSelfBrutsForce(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    prod *= nums[j];
                }
            }
            res[i] = prod;
        }
        return res;
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        // Calculate prefix
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            prod *= nums[i];
            prefix[i] = prod;
        }
        // calculate Suffix
        prod = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            prod *= nums[i];
            suffix[i] = prod;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[i] = suffix[i + 1];
            } else if (i == nums.length - 1) {
                result[i] = prefix[i - 1];
            } else {
                result[i] = prefix[i - 1] * suffix[i + 1];
            }

        }


        return result;
    }
}
