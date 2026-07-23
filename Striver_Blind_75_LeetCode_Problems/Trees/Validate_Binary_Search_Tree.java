package Striver_Blind_75_LeetCode_Problems.Trees;

public class Validate_Binary_Search_Tree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static void main() {
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(3);
        a.left = b;
        a.right = c;
        System.out.println(isValidBST(a));
    }

    public static boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean helper(TreeNode root, Long min, Long max) {
        if (root == null) {
            return true;
        }
        if (root.val >= max || root.val <= min) {
            return false;
        }
        return helper(root.left, min, (long) root.val) && helper(root.right, (long) root.val, max);
    }
}
