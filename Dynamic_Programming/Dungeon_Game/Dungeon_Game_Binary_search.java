package Dynamic_Programming.Dungeon_Game;

import java.util.Scanner;

public class Dungeon_Game_Binary_search {
    static int m;
    static int n;
    static void main() {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] arr=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(calculateMinimumHP(arr));

    }
    public static int calculateMinimumHP(int[][] dungeon) {
        m = dungeon.length;
        n = dungeon[0].length;

        int left = 1;
        int right = (int) 4e7;
        int minHealth = (int) 4e7;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cansurvive(0, 0, mid, dungeon)) {
                minHealth = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return minHealth;

    }

    public static boolean  cansurvive(int i, int j, int mid, int[][] dungeon) {
        if (i >= m || j >= n) {
            return false;
        }
        mid += dungeon[i][j];
        if (mid <=0) {
            return false;
        }
        if (i == m - 1 && j == n - 1) {
            return true;
        }

        return cansurvive(i, j + 1, mid, dungeon) || cansurvive(i + 1, j, mid, dungeon);
    }
}
