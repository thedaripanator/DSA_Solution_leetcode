package Arrays.SlidingWindow.Variable;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Operations_to_Reduce_X_to_Zero {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(minOperations(arr, x));
    }

    public static int minOperations(int[] nums, int x) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int target = total - x;
        if (target < 0) {
            return -1;
        }
        if (target == 0) {
            return nums.length;
        }

        int i = 0;
        int sum = 0;
        int max = -1;
        int j = 0;
        while (j < nums.length) {
            sum += nums[j];
            while (sum > target) {
                sum -= nums[i];
                i++;
            }
            if (sum == target) {
                max = Math.max(max, j - i + 1);
            }

            j++;
        }
        return max == -1 ? -1 : nums.length - max;
    }
}
