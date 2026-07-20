package Striver_Blind_75_LeetCode_Problems.Trees;

public class invert_tree_226 {

    // TreeNode class
    static class TreeNode{
        int val;
        TreeNode left,right;
        TreeNode(int val){
            this.val=val;
        }
    }


    // function used to invert the tree
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);

        root.left=right;
        root.right=left;

        return root;
    }
}
