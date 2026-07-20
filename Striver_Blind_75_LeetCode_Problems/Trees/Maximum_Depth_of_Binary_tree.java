package Striver_Blind_75_LeetCode_Problems.Trees;

// maxDepth function is the function used to solve this problem

import java.util.*;

public class Maximum_Depth_of_Binary_tree {
    // TreeNode class
    static class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    // Main Function
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

        System.out.println(maxDepth(root));
    }

    // Function used to create the Tree
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

    // Main function which is used to find the maximum depth of the binary tree
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
