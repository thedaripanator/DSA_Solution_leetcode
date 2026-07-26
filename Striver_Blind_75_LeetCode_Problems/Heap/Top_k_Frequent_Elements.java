package Striver_Blind_75_LeetCode_Problems.Heap;

import java.util.*;

public class Top_k_Frequent_Elements {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();
        int [] res=topKFrequent(arr,k);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
           HashMap<Integer,Integer> map=new HashMap<>();
           for(int i:nums){
               map.put(i,map.getOrDefault(i,0)+1);
           }
        PriorityQueue<int []> minheap=new PriorityQueue<>((a,b)-> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]);
            }
            ;
            return Integer.compare(a[0], b[0]);
        });
           for(Map.Entry<Integer,Integer> c:map.entrySet()){
               minheap.add(new int[]{
                       c.getValue(),c.getKey()
               });
               if(minheap.size()>k){
                   minheap.remove();
               }
           }
        List<Integer> res1=new ArrayList<>();
           while(!minheap.isEmpty()){
               res1.add(minheap.peek()[1]);
               minheap.remove();
           }
           Collections.reverse(res1);
        int [] res=new int[res1.size()];
           for(int i=0;i< res1.size();i++){
               res[i]=res1.get(i);
           }
           return res;
    }

}
