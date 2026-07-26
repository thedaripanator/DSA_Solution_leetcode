package Arrays.SlidingWindow.Variable;

import java.util.HashMap;
import java.util.Scanner;

public class Pick_Toy  {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(longest_substring_k_characters(str));
    }

    public static int longest_substring_k_characters(String str) {
        int max = 0;
        int i = 0, j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < str.length()) {
            map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
            while (map.size() > 2) {
                map.put(str.charAt(i), map.get(str.charAt(i)) - 1);
                if (map.get(str.charAt(i)) == 0) {
                    map.remove(str.charAt(i));
                }
                i++;
            }
            if (map.size() == 2) {
                max = Math.max(max, j - i + 1);
            }
            j++;
        }
        return max;
    }
}
