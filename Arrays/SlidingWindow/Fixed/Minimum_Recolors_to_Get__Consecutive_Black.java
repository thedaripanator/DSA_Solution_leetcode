package Arrays.SlidingWindow.Fixed;

import java.util.Scanner;

public class Minimum_Recolors_to_Get__Consecutive_Black {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        System.out.println(minimumRecolors(str, k));
    }

    public static int minimumRecolors(String blocks, int k) {
        // Question of sliding window
        int white = 0;
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        while (j < blocks.length()) {
            if (blocks.charAt(j) == 'W') {
                white++;
            }

            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                min = Math.min(min, white);
                if (blocks.charAt(i) == 'W') {
                    white--;
                }
                i++;
                j++;

            }

        }
        return min;

    }
}
