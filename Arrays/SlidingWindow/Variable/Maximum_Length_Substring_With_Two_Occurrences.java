package Arrays.SlidingWindow.Variable;

import java.util.HashMap;
import java.util.Scanner;

public class Maximum_Length_Substring_With_Two_Occurrences {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(maximumLengthSubstring(str));
    }
    public static int maximumLengthSubstring(String s) {
        int max=0;
        int i=0;
        int j=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(j<s.length()){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}
