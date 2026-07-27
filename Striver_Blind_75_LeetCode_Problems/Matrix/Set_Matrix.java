package Striver_Blind_75_LeetCode_Problems.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Set_Matrix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        setZeroes(mat);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void setZeroes(int[][] matrix) {
        boolean [] row=new boolean[matrix.length];
        boolean [] column=new boolean[matrix[0].length];
        int m=matrix.length;
        int n=matrix[0].length;
        // Default  value to true
        Arrays.fill(row,true);
        Arrays.fill(column,true);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=false;
                    column[j]=false;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!(row[i] && column[j])){
                    matrix[i][j]=0;
                }
            }
        }

    }



}
