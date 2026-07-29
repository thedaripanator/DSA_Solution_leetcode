package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Different_Ways_to_Add_Parentheses {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(diffWaysToCompute(str));
    }

    public static List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            List<Integer> left = new ArrayList<>();
            List<Integer> right = new ArrayList<>();
            if (ch == '+' || ch == '*' || ch == '-') {
                left = diffWaysToCompute(expression.substring(0, i));
                right = diffWaysToCompute(expression.substring(i + 1));
                for (int x : left) {
                    for (int y : right) {
                        if (ch == '+') {
                            res.add(x + y);
                        }
                        if (ch == '-') {
                            res.add(x - y);
                        }
                        if (ch == '*') {
                            res.add(x * y);
                        }
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add(Integer.parseInt(expression));
        }
        return res;
    }
}
