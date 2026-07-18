package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class sum_of_element_between_k1_smallest_and_k2_smallest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k1=sc.nextInt();
        int k2=sc.nextInt();

        System.out.println(sum(arr,k1,k2));

    }
    public static int sum(int [] arr,int k1,int k2){
        int first=kthsmallest(arr,k1);
        int second=kthsmallest(arr,k2);
        int res=0;
        for(int i:arr){
            if(i>first && i<second){
                res+=i;
            }
        }
        return res;
    }

    public static  int kthsmallest(int [] arr,int k){
        PriorityQueue<Integer> maxheap=new PriorityQueue<>((a,b)->b-a);
        for(int i:arr){
            maxheap.offer(i);
            if(maxheap.size()>k){
                maxheap.remove();
            }
        }
        return maxheap.peek();
    }

}


// Time complexity : O(nlog k)
