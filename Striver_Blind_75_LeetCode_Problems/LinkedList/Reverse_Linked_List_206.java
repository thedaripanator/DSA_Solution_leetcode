package Striver_Blind_75_LeetCode_Problems.LinkedList;
import java.util.Scanner;
public class Reverse_Linked_List_206 {
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

    public static Node reverseList(Node head){
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            Node temp1=temp.next;
            temp.next=prev;
            prev=temp;
            temp=temp1;
        }
        return prev;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node res=create(arr);
        Node result=reverseList(res);
        while(result!=null){
            System.out.print(result.val+"->");
            result=result.next;
        }
    }
}
