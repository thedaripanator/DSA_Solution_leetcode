package Arrays.SlidingWindow.Variable;

import java.util.HashMap;
import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE;
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0;
        while(j<s.length()){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                while(map.get(s.charAt(j))>1){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
