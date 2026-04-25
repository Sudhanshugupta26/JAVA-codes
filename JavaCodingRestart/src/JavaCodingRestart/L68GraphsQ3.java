package JavaCodingRestart;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class l68GraphsQ3 {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

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

        Queue<Integer> q = new LinkedList<>();  // Now finding the path using BFS
        boolean[] visited = new boolean[n];
        q.add(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int idx = q.remove();
            if(visited[destination])return true;
            for(int ele : adj.get(idx)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele]=true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
