package Heap;

import java.util.*;

public class k_closest_number {
    public static void  main(String[] args){
        int [] arr={1,2,3,4,5};
        int k=4;
        int x=3;
        List<Integer> res=closest(arr,k,x);
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
    public static List<Integer> closest(int [] arr,int k,int x){
        List<Integer> res=new ArrayList<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(b[0], a[0]);
        });
        for(int i=0;i<arr.length;i++) {
            maxHeap.add(new int[]{Math.abs(x - arr[i]), arr[i]});
            if (maxHeap.size() > k) {
                maxHeap.remove();
            }
        }
        while(!maxHeap.isEmpty()){
            res.add(maxHeap.peek()[1]);
            maxHeap.remove();
        }
        Collections.sort(res);
        return res;
    }
}
