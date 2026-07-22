// Creating a linkedlist manually
package Striver_Blind_75_LeetCode_Problems.LinkedList;

import java.util.Scanner;

public class LinkedList_class {
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

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node res=create(arr);
        while(res!=null){
            System.out.print(res.val+"->");
            res=res.next;
        }
    }
}
