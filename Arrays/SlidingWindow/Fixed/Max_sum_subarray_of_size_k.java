package Arrays.SlidingWindow.Fixed;

import java.util.Scanner;

public class Max_sum_subarray_of_size_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(min_subarray_sum(arr, k));
    }

    public static int max_subarray_sum(int[] arr, int k) {
        int i = 0, j = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
    public static int min_subarray_sum(int[] arr, int k) {
        int i = 0, j = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < k) {
                j++;
            } else {
                min = Math.min(min, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return min;
    }

}
