package Arrays.SlidingWindow.Variable;

import java.util.HashMap;
import java.util.Scanner;

public class Minimum_window_String {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(minwindow(s, t));

    }

    public static String minwindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        String res = "";
        HashMap<Character, Integer> map = new HashMap<>();
        // Storing the Character frequency in the map for the second String
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }

        int i = 0, j = 0;
        int count = map.size();
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                if (map.get(s.charAt(j)) == 0) {
                    count--;
                }
            }
            while (count == 0) {
                if (min > j - i + 1) {
                    min = j - i + 1;
                    res = s.substring(i, j + 1);
                }
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    if (map.get(s.charAt(i)) == 1)
                        count++;
                }
                i++;
            }
            j++;
        }
        return res;
    }
}
