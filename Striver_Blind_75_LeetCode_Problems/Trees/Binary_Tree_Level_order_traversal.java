package Striver_Blind_75_LeetCode_Problems.Trees;

import java.util.*;

public class Binary_Tree_Level_order_traversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static void main() {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);
        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;
        List<List<Integer>> res=levelOrder(a);
        for(List<Integer> x:res){
            System.out.print(Arrays.toString(x.toArray())+",");
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null ){
            return result;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode x=queue.poll();
                if(x.left!=null){
                    queue.add(x.left);
                }
                if(x.right!=null){
                    queue.add(x.right);
                }
                temp.add(x.val);
            }
            result.add(temp);
        }
        return result;
    }
}
