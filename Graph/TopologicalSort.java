package Graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort {

    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
        }
        System.out.println(topo(n, adj));

    }

    public static ArrayList<Integer> topo(int n, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[n];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(adj, i, vis, s);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!s.isEmpty()) {
            res.add(s.pop());
        }
        return res;
    }

    public static void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] vis, Stack<Integer> s) {
        vis[node] = true;
        for (int it : adj.get(node)) {
            if (!vis[it]) {
                dfs(adj, it, vis, s);
            }
        }
        s.push(node);
    }
}
