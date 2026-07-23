package Striver_Blind_75_LeetCode_Problems.Trees;

public class Binary_tree_maximum_path_sum {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static int res=Integer.MIN_VALUE;
    static void main() {
        TreeNode a=new TreeNode(-10);
        TreeNode b=new TreeNode(9);
        TreeNode c=new TreeNode(20);
        TreeNode d=new TreeNode(15);
        TreeNode e=new TreeNode(7);

        a.left=b;
        a.right=c;
        c.left=d;
        c.right=e;
        System.out.println(maxPathSum(a));
    }

    public static int maxPathSum(TreeNode root) {
        res(root);
        return res;
    }
    public static int res(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=res(root.left);
        int right=res(root.right);

        int temp=Math.max(root.val,Math.max(left,right)+root.val);
        int ans=Math.max(temp,left+right+root.val);
        res=Math.max(res,ans);
        return temp;
    }
}
