package Arrays.SlidingWindow.Variable;

import java.util.Scanner;

public class Longest_Subarray_of_1s_After_Deleting_One_Element {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(longestSubarray(arr));
    }
    public static int longestSubarray(int[] nums) {
        int zero=0;
        int i=0;
        int j=0;
        int max=Integer.MIN_VALUE;
        while(j< nums.length){
            if(nums[j]==0){
                zero++;
            }
            while(zero>1){
                if(nums[i]==0){
                    zero--;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max-1;
    }
}
