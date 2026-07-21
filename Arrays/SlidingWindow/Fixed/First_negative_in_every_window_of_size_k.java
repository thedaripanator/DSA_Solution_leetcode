package Arrays.SlidingWindow.Fixed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First_negative_in_every_window_of_size_k {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        List<Integer> res = first_negative(arr, k);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }

    public static List<Integer> first_negative(int[] arr, int k) {

        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int i = 0, j = 0;

        while (j < arr.length) {

            if (arr[j] < 0) {
                temp.add(arr[j]);
            }

            if (j - i + 1 < k) {
                j++;
            } else {

                if (temp.isEmpty()) {
                    result.add(0);
                } else {
                    result.add(temp.get(0));
                }

                if (!temp.isEmpty() && arr[i] == temp.get(0)) {
                    temp.remove(0);
                }

                i++;
                j++;
            }
        }

        return result;
    }

}
