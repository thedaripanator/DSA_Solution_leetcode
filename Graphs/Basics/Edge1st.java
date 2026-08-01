package Graphs.Basics;

import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Edge1st {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        // Adjacency Matrix
//        int [][] adj=new int[n+1][m+1];
//        for(int i=0;i<m;i++){
//            int u=sc.nextInt();
//            int v=sc.nextInt();
//            adj[v][u]=1;
//            adj[u][v]=1;
//        }

        // Adjacency List
        ArrayList<Integer>[] adj1=new ArrayList[n+1];
        for(int i=0;i<=n;i++){
            adj1[i]=new ArrayList<>();
        }
        for(int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj1[u].add(v);
            adj1[v].add(v);
        }
        System.out.println(adj1[1]);
    }
}
