package Dynamic_Programming;

import java.util.HashMap;
import java.util.Scanner;

public class Minimum_Number_of_Operations_to_Make_X_and_Y_Equal {
    static HashMap<Integer, Integer> dp = new HashMap<>();

    static void main() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(minimumOperationsToMakeEqual(x, y));
    }

    public static int minimumOperationsToMakeEqual(int x, int y) {

        if (x == y) {
            return 0;
        }
        if(x<=y){
            return y-x;
        }
        if (dp.containsKey(x)) {
            return dp.get(x);
        }
        int ans = Math.abs(x - y);


        ans = Math.min(ans, (x % 5) + 1 + minimumOperationsToMakeEqual(x / 5, y));
        if(x%5!=0)
         ans = Math.min(ans, (5 - x % 5) + 1 + minimumOperationsToMakeEqual((x + 5 - x % 5) / 5, y));


        ans = Math.min(ans, (x % 11) + 1 + minimumOperationsToMakeEqual(x / 11, y));
        if(x%11!=0)
         ans = Math.min(ans, (11 - x % 11) + 1 + minimumOperationsToMakeEqual((x + 11 - x % 11) / 11, y));
        dp.put(x, ans);
        return ans;
    }
}