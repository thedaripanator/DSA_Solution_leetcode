package Arrays;

import java.util.Scanner;

public class Largest {
    // main function
    static void main() {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
        largestnumber(arr);
        System.out.println(simplified(arr));
    }
    public static void largestnumber(int [] arr){
        int n=arr.length;
        int largest=arr[0];
        int second=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(largest<arr[i]){
                second=largest;
                largest=arr[i];
            }
            if(arr[i] > second && arr[i]<largest){
                second=arr[i];
            }
            // 0(n)
        }
        System.out.println("Largest :"+largest+" Second Largest :"+second);
    }
    public static int simplified(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int item:arr){
            max=Math.max(item,max);
        }
        return max;
    }
}

// Sort it
// you return the second last element of the sorted element
// 0(nlog n)    VS 0(n)








