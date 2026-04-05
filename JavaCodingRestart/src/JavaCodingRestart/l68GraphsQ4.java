package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;

public class l68GraphsQ4 {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]=='1' && !visited[i][j]) {
                    bfs(i, j, grid, visited,n,m);
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(int i, int j, char[][] grid, boolean[][] visited,int n,int m) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});  //Initializing the queue with the starting point.
        visited[i][j]=true;
        while (!q.isEmpty()) {
            int[] front = q.remove();
            int x = front[0], y = front[1];
            if((y+1)<m && grid[x][y+1]=='1' && !visited[x][y+1]){
                q.add(new int[]{x,y+1});
                visited[x][y+1]=true;
            }
            if((x+1)<n && grid[x+1][y]=='1' && !visited[x+1][y]){
                q.add(new int[]{x+1,y});
                visited[x+1][y]=true;
            }
            if( (x-1)>=0 && grid[x-1][y]=='1' && !visited[x-1][y]){
                q.add(new int[]{x-1,y});
                visited[x-1][y]=true;
            }
            if((y-1)>=0 &&grid[x][y-1]=='1' && !visited[x][y-1]){
                q.add(new int[]{x,y-1});
                visited[x][y-1]=true;
            }
        }
    }

    public static void main(String[] args) {

    }
}
