package Arrays;

import java.util.Scanner;

public class Check_sorted_II {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {
        int counter=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]> nums[(i+1)%nums.length]){
                counter++;
            }
        }

        if(counter==1){
            return true;
        }
        return false;
    }
}

//  3 4 5  1 2      70 80 90 50 60   1 2 3 4 5


// Algorithm

//  3 4 5 1 2     counter=0

//  3<4
// 4<5
// 5<1      counter=1
// 1<2
// 2<3

