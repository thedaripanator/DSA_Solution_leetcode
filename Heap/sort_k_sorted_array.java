package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class sort_k_sorted_array {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       int k=sc.nextInt();
       arr=sort_k(arr,k);
       for(int i:arr){
           System.out.println(i+" ");
       }

    }
    static int[] sort_k(int [] arr,int max){
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        int k=0;
        for(int i=0;i<arr.length;i++){
            heap.add(arr[i]);
            if(heap.size() > max){
                arr[k++]=heap.remove();
            }
        }
        while(!heap.isEmpty()){
            arr[k++]=heap.remove();
        }
        return arr;
    }
}
