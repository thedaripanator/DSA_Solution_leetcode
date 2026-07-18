package Dynamic_Programming.house_robber;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HouseRobberIII {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // number of elements
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == -1)
                arr[i] = null;
            else
                arr[i] = x;
        }

        TreeNode root = buildTree(arr);

        System.out.println(rob(root));
    }
    public static TreeNode buildTree(Integer[] arr) {

        if (arr.length == 0 || arr[0] == null)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.length) {

            TreeNode curr = q.poll();

            if (i < arr.length && arr[i] != null) {
                curr.left = new TreeNode(arr[i]);
                q.offer(curr.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                curr.right = new TreeNode(arr[i]);
                q.offer(curr.right);
            }
            i++;
        }
        return root;
    }
    public static int rob(TreeNode root) {
        int[] ans = dfs(root);
        return Math.max(ans[0], ans[1]);
    }

    // returns {rob, notRob}
    private static int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        // If we rob this node, we cannot rob its children
        int rob = node.val + left[1] + right[1];

        // If we don't rob this node, children can be robbed or not
        int notRob = Math.max(left[0], left[1]) +
                Math.max(right[0], right[1]);

        return new int[]{rob, notRob};
    }
}
