package Arrays.SlidingWindow.Variable;

import java.util.HashMap;
import java.util.Scanner;

public class Longest_Repeating_Character_Replacement {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k=sc.nextInt();
        System.out.println(characterReplacement(str,k));
    }
    public static int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            maxFreq = Math.max(maxFreq, map.get(ch));

            while ((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                map.put(left, map.get(left) - 1);
                i++;
            }

            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}
