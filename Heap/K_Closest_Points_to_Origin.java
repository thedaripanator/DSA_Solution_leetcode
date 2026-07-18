package Heap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class K_Closest_Points_to_Origin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        int  k=sc.nextInt();
        int [][] res=kClosest(arr,k);
        for(int [] ans:res){
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        int [][] res=new int [k][2];
        PriorityQueue<int []> maxheap=new PriorityQueue<>((a,b)->{
            return Integer.compare(b[0],a[0]);
        });
        for(int i=0;i<points.length;i++){
            int dis=(points[i][0]*points[i][0]) + (points[i][1]*points[i][1]);
            maxheap.add(new int[]{dis,points[i][0],points[i][1]});
            if(maxheap.size()>k) {
                maxheap.remove();
            }
        }
        int index=0;
        while(!maxheap.isEmpty()){
            res[index][0]=maxheap.peek()[1];
            res[index][1]=maxheap.peek()[2];
            index++;
            maxheap.poll();
        }



        return res;
    }
}
