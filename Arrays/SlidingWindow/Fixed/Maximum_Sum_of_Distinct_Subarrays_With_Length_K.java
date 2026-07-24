package Arrays.SlidingWindow.Fixed;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maximum_Sum_of_Distinct_Subarrays_With_Length_K {

    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(maximumSubarraySum(arr,k));
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        int i=0;
        int j=0;
        Map<Integer,Integer> map=new HashMap<>();
        long max=0;
        long sum=0;
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum+=nums[j];
            if(j-i+1>k){
                sum-=nums[i];
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;

            }
            if(j-i+1==k && map.size()==k){
                max=Math.max(max,sum);
            }
            j++;

        }
        return max;
    }
}
