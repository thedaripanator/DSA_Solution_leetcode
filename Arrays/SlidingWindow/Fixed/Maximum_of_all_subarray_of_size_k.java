/*
Problem: Maximum of All Subarrays of Size K

Input:
arr[] = {1, 3, -1, -3, 5, 3, 6, 7}
k = 3

Subarrays of size 3:
[1, 3, -1]   -> 3
[3, -1, -3]  -> 3
[-1, -3, 5]  -> 5
[-3, 5, 3]   -> 5
[5, 3, 6]    -> 6
[3, 6, 7]    -> 7

Output:
[3, 3, 5, 5, 6, 7]

--------------------------------------------------

Example 2:

Input:
arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13}
k = 4

Output:
[10, 10, 10, 15, 15, 90, 90]

--------------------------------------------------

Example 3:

Input:
arr[] = {4, 2, 12, 3}
k = 1

Output:
[4, 2, 12, 3]

--------------------------------------------------

Example 4:

Input:
arr[] = {9, 7, 2, 4, 6, 8, 2, 1}
k = 8

Output:
[9]

Expected Complexity:
Time  : O(n)
Space : O(k)

Hint:
Use a Deque to store indices.
- Remove indices outside the current window.
- Remove smaller elements from the back.
- Front of the deque always stores the index of the maximum element.
*/

package Arrays.SlidingWindow.Fixed;

import java.util.*;

public class Maximum_of_all_subarray_of_size_k {
    static void main() {
        int [] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        List<Integer> res=maximumWindow(arr,k);
        System.out.println(res);
    }


    public static List<Integer> maximumWindow(int[]  arr, int k){
        List<Integer> result=new ArrayList<>();
        Deque<Integer> queue=new LinkedList<>();
        int i=0;
        int j=0;
        while(j<arr.length){
            while(!queue.isEmpty() && queue.peekLast()<arr[j]){
                queue.pollLast();
            }
            queue.offerLast(arr[j]);
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                result.add(queue.peekFirst());
                if(arr[i] == queue.peekFirst()){
                    queue.pollFirst();
                }
                i++;
                j++;
            }
        }
        return result;
    }
}
