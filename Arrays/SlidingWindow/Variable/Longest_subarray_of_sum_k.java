package Arrays.SlidingWindow.Variable;

import java.util.Scanner;

public class Longest_subarray_of_sum_k {

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(longest_subarray(arr,k));
    }
    public static int longest_subarray(int [] arr, int k){
        int max=0;
        int i=0;
        int j=0;
        int sum=0;
        while(j<arr.length){
            sum+=arr[j];
            if(sum>k){
                while(sum>k) {
                    sum -= arr[i];
                    i++;
                }
            }
            if(sum==k){
                max=Math.max(max,j-i+1);
            }
            j++;
        }
        return max;
    }
}
