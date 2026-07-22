package Striver_Blind_75_LeetCode_Problems.LinkedList;

import java.util.Scanner;

public class Merge_two_Sorted_Lists {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val=val;
        }


    }
    public  static Node create(int [] arr){
        Node head=new Node(0);
        Node temp1=head;
        for(int i=0;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            temp1.next=temp;
            temp1=temp1.next;
        }
        return head.next;
    }

    public static Node mergeTwoLists(Node list1,Node list2){
         Node head=new Node(0);
         Node temp=head;
         while(list1!=null && list2!=null){
             if(list1.val>=list2.val){
                 temp.next=list2;
                 list2=list2.next;
                 temp=temp.next;
             }
             else{
                 temp.next=list1;
                 temp=temp.next;
                 list1=list1.next;
             }
         }
         while(list1!=null){
             temp.next=list1;
             list1=list1.next;
             temp=temp.next;
         }
        while(list2!=null){
            temp.next=list2;
            list2=list2.next;
            temp=temp.next;
        }
         return head.next;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int [] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        Node res1=create(arr);
        Node res2=create(arr2);

        Node result=mergeTwoLists(res1,res2);
        while(result!=null){
            System.out.print(result.val+"->");
            result=result.next;
        }
    }
}
