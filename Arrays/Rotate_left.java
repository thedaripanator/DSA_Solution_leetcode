package Arrays;

import java.util.Scanner;

public class Rotate_left {

    // main Function
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        // input of the array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotate(arr,k);
        // Printing Rotated Array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static  void rotate(int[] nums, int k) {
        k=k%nums.length;

        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
    }

    // Reversing an Array code
    public static void reverse(int [] arr,int start,int end){
        int i=start;
        int j=end;
        while(j>i){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}

