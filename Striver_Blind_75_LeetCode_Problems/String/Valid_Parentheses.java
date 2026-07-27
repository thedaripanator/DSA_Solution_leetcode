package Striver_Blind_75_LeetCode_Problems.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Valid_Parentheses {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println(isValid(x));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char t = stack.pop();
                if (map.get(t) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
