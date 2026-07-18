package Dynamic_Programming.house_robber;

import java.util.Scanner;

public class HouseRobber_II {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(rob(nums));

    }

        public static int rob(int[] nums) {

            int n = nums.length;

            if (n == 1)
                return nums[0];

            return Math.max(
                    robRange(nums, 0, n - 2),
                    robRange(nums, 1, n - 1)
            );
        }

        private static int robRange(int[] nums, int start, int end) {

            int length = end - start + 1;

            if (length == 1)
                return nums[start];

            int[] dp = new int[length];

            dp[0] = nums[start];
            dp[1] = Math.max(nums[start], nums[start + 1]);

            for (int i = 2; i < length; i++) {
                dp[i] = Math.max(dp[i - 1],
                        nums[start + i] + dp[i - 2]);
            }

            return dp[length - 1];
        }
}
