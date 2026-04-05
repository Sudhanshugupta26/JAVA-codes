package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;

public class L68GraphsQ1 {
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count  = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                bfs(i,visited,adj);
                //dfs(i,visited,adj);
                count++;
            }
        }
        return count;
    }

    private void dfs(int i, boolean[] visited, int[][] adj) {   // TC is same but it takes more space because of callstack.
        int n = adj.length;
        visited[i]=true;
        for (int j = 0; j < n; j++) {
            if(!visited[j] && adj[i][j]==1){
                dfs(j,visited,adj);
                visited[j]=true;
            }
        }
    }
  
    private void bfs(int i, boolean[] visited, int[][] adj) {
        int n = adj.length;
        visited[i]=true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front = q.remove();
            for (int j = 0; j < n; j++) {
                if(!visited[j] && adj[front][j]==1){
                    visited[j]=true;
                    q.add(j);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
