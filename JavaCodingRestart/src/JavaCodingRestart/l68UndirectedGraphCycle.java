package JavaCodingRestart;

import java.util.ArrayList;
import java.util.List;

public class l68UndirectedGraphCycle {
    public boolean isCycle(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();    // Creating our own adjacency list first
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {    // Assigning values to the adjacency list.
            int a  = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++) {    // Checking for cycle using DFS on all nodes.
            if(!visited[i]) {
                if(dfs(i, -1, visited, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int val, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[val]=true;
        for (int neighbor : adj.get(val)) {
            if(!visited[neighbor]){
                if(dfs(neighbor, val, visited, adj)) {
                    return true;
                }
            }
            else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
