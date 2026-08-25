package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Remove_Sorted_element {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        // add the elements to the hashset
        for(int item:nums){
            set.add(item);
        }
        int i=0;
        for(int st:set){
            nums[i++]=st;
        }
        return set.size();
    }
}
