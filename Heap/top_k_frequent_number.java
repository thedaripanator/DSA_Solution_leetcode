package Heap;

import java.util.*;

public class top_k_frequent_number {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int [] arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         int k=sc.nextInt();
         List<Integer> ans=helper(arr,k);
         for(int i=0;i<ans.size();i++){
             System.out.print(ans.get(i)+" ");
         }
    }
    public static List<Integer> helper(int [] arr,int k){
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        PriorityQueue<int []> minheap=new PriorityQueue<>((a,b)-> {
            if (a[0] == b[0] ){
                return Integer.compare(b[1], a[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        for (Map.Entry<Integer,Integer> c:map.entrySet()){
            minheap.add(new int[]{
                    c.getValue(),c.getKey()
            });
            if(minheap.size()>k){
                minheap.remove();
            }
        }

        while(!minheap.isEmpty()) {
            res.add(minheap.peek()[1]);
            minheap.remove();
        }

        Collections.reverse(res);
        return res;
    }
}

