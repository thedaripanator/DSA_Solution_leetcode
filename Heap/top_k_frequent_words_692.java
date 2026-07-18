package Heap;

import java.util.*;

public class top_k_frequent_words_692 {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         String [] words=new String[n];
         for(int i=0;i<n;i++){
             words[i]=sc.next();
         }
         int k=sc.nextInt();
         List<String> ans=topKFrequent(words,k);
         System.out.println(ans);
    }
    static class Pair{
        int num;
        String str;
        Pair(int num,String str){
            this.num=num;
            this.str=str;
        }
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> res=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Pair> minheap=new PriorityQueue<>((a,b)->{
            if (a.num == b.num) {
                return b.str.compareTo(a.str);
            }
            return Integer.compare(a.num,b.num);
        });
        for(Map.Entry<String,Integer> c:map.entrySet()){
            minheap.offer(new Pair(c.getValue(),c.getKey()));
            if(minheap.size()>k){
                minheap.remove();
            }
        }

        while(!minheap.isEmpty()) {
            res.add(minheap.poll().str);
        }
        Collections.reverse(res);
        return res;
    }
}
