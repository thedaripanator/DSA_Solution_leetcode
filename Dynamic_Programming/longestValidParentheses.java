package Dynamic_Programming;

import java.util.Scanner;
import java.util.Stack;

public class longestValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longestvalidParenthese(str));
    }

    public static int longest(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (isbalanced(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    public static boolean isbalanced(String s, int i, int j) {
        Stack<Character> stack = new Stack<>();
        for (int k = i; k <= j; k++) {
            if (s.charAt(k) == '(') {
                stack.push(s.charAt(k));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
    // optimal Solution : O(n)
    public static int longestvalidParenthese(String s) {
        int n = s.length();
        int[] dp = new int[n];
        int ans = 0;

        for (int i = 1; i < n; i++) {

            if (s.charAt(i) == ')') {

                // Case 1: "()"
                if (s.charAt(i - 1) == '(') {
                    dp[i] = 2;
                    if (i >= 2)
                        dp[i] += dp[i - 2];
                }

                // Case 2: "...))"
                else {
                    int j = i - dp[i - 1] - 1;

                    if (j >= 0 && s.charAt(j) == '(') {
                        dp[i] = dp[i - 1] + 2;

                        if (j >= 1)
                            dp[i] += dp[j - 1];
                    }
                }
            }

            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
}

// Time complexity is O(n2)..  so it is giving tle

