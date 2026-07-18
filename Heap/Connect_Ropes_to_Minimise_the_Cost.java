package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Connect_Ropes_to_Minimise_the_Cost {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(min_cost(arr));

    }
    public static int min_cost(int [] arr){
        PriorityQueue<Integer> minheap=new PriorityQueue<>((a,b)->
                a-b);
        int cost=0;
        // Insertion into the heap
        for(int i:arr){
            minheap.offer(i);
        }
        while(minheap.size()!=1){
            int m=minheap.poll();
            int n=minheap.poll();
            cost+=m+n;
            minheap.offer(m+n);
        }
        return cost;
    }
}
