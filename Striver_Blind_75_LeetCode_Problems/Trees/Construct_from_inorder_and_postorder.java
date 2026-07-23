package Striver_Blind_75_LeetCode_Problems.Trees;

import java.util.HashMap;
import java.util.Map;

public class Construct_from_inorder_and_postorder {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    int postidx;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        postidx=postorder.length-1;
        return helper(postorder,map,0,inorder.length-1);
    }
    public TreeNode helper(int [] postorder, Map<Integer,Integer> map, int left, int right){
        if(right<left){
            return null;
        }
        int rootval=postorder[postidx--];
        TreeNode root=new TreeNode(rootval);
        int mid=map.get(rootval);
        root.right=helper(postorder,map,mid+1,right);
        root.left=helper(postorder,map,left,mid-1);
        return root;
    }

}
