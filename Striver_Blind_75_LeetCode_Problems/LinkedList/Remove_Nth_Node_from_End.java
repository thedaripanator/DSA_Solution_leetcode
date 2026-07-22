package Striver_Blind_75_LeetCode_Problems.LinkedList;

import java.util.Scanner;

public class Remove_Nth_Node_from_End {
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
    public static Node removeNthFromEnd(Node arr,int n){
        Node head=arr;
        Node temp=head;
        int total=0;
        while(temp!=null){
            total++;
            temp=temp.next;
        }


        int pre=total-n;
        if(pre==0){
            return head.next;
        }
        temp=head;
        Node prev=null;
        for(int i=0;i<pre;i++){
            prev=temp;
            temp=temp.next;
        }
        if(temp.next!=null){
            prev.next=temp.next;
        }
        else{
            prev.next=null;
        }
        return head;

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        Node res1=create(arr);

        Node res=removeNthFromEnd(res1,x);
        while(res!=null){
            System.out.print(res.val+"->");
            res=res.next;
        }
    }
}
