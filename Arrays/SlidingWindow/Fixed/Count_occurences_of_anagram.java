package Arrays.SlidingWindow.Fixed;

import java.util.HashMap;
import java.util.Scanner;

public class Count_occurences_of_anagram {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        String pattern=sc.next();
        System.out.println(count(text,pattern));

    }
    public static int count(String text, String pattern) {

        int k = pattern.length();
        int ans = 0;
        int i = 0, j = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int x = 0; x < k; x++) {
            char ch = pattern.charAt(x);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();

        while (j < text.length()) {

            char ch = text.charAt(j);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) == 0) {
                    count--;
                }
            }

            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {

                if (count == 0) {
                    ans++;
                }

                char left = text.charAt(i);

                if (map.containsKey(left)) {

                    if (map.get(left) == 0) {
                        count++;
                    }

                    map.put(left, map.get(left) + 1);
                }

                i++;
                j++;
            }
        }

        return ans;
    }

}
