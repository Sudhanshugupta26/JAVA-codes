package JavaCodingRestart;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class l68BipartiteGraph {

    static boolean ans;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int visited[] = new int[n];
        Arrays.fill(visited,-1); // It will fill all array elements with -1.
        for (int i = 0; i < n; i++) {
            if (visited[i]==-1) bfs(i,graph,visited);
        }
        return ans;
    }

    private void bfs(int i, int[][] graph, int[] visited) {
        Queue<Integer> q = new LinkedList<>();
        visited[i]=0; // 0 -> Blue, 1 -> Red
        q.add(i);
        while(!q.isEmpty()){
            int front = q.remove();
            int color = visited[front];
            for(int ele : graph[front]){
                if(visited[ele]==-1){
                    visited[ele] = 1-color;    // 0 -> 1 , 1 -> 0
                    q.add(ele);
                }else if(visited[ele]==color){
                    ans = false;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
