package Heap;
import java.util.*;
public class frequency_sort {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] res = sort(arr);

        for (int x : res) {
            System.out.print(x + " ");
        }
    }

    public static int [] sort(int [] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] res=new int[arr.length];
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
                (a, b) -> b[1] - a[1]
        );

        for(Map.Entry<Integer,Integer> c:map.entrySet()){
            maxHeap.offer(new int[]{c.getKey(),c.getValue()});
        }

        int index = 0;
        while (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.poll();
            int element = curr[0];
            int freq = curr[1];

            while (freq-- > 0) {
                res[index++] = element;
            }
        }


        return res;
    }
}
