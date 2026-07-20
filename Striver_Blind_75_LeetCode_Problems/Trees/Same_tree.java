package Striver_Blind_75_LeetCode_Problems.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Same_tree {
     static class TreeNode{
         int val;
         TreeNode left,right;
         TreeNode(int val){
             this.val=val;
         }
     }

    // Leetcode based Solution
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> p1=new LinkedList<>();
        Queue<TreeNode> q1=new LinkedList<>();

        p1.add(p);
        q1.add(q);
        while(!p1.isEmpty() && !q1.isEmpty()){
            TreeNode p2=p1.poll();
            TreeNode q2=q1.poll();
            if(p2==null & q2==null){
                continue;
            }
            if(p2 == null || q2 == null ||p2.val!=q2.val){
                return false;
            }
            if(p2!=null){
                p1.add(p2.left);
                p1.add(p2.right);
            }
            if(q2!=null){
                q1.add(q2.left);
                q1.add(q2.right);
            }
        }
        return true;
    }
}
