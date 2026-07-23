package Striver_Blind_75_LeetCode_Problems.Trees;

public class Kth_smallest_element_in_a_bst {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int count = 0;
    static int result = -1;

    static void main() {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(4);
        TreeNode d = new TreeNode(2);

        a.left = b;
        a.right = c;
        b.right = d;

        System.out.println(kthSmallest(a, 1));
    }

    public static int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    public static void traverse(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        traverse(root.left, k);
        count++;
        if (count == k) {
            result = root.val;
            return;
        }

        if (count < k) {
            traverse(root.right, k);
        }
    }
}
