package JavaCodingRestart;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class l69Dijkstra {
    public static class Triple implements Comparable<Triple> {
        int x, y, z;
        public Triple(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public int compareTo(Triple o) {
            if(this.z==o.z)return this.x-o.x;   // if z is same then compare x
            return this.z-o.z;  // For the min heap.
            //return o.z-this.z; For the max heap.
        }
    }

    public int minimumEffortPath(int[][] arr) {
        int m = arr.length; int n = arr[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = Integer.MAX_VALUE;
            }
        }
        ans[0][0] = 0;
        PriorityQueue<Triple> eff = new PriorityQueue<>();
        eff.add(new Triple(0,0,0));
        int r[] = {-1,0,1,0};   // up,left,down,right
        int c[] = {0,-1,0,1};   // up,left,down,right
        while(eff.size()>0){
            Triple p = eff.remove();
            int row = p.x; int col = p.y; int cost = p.z;
            if(row==m-1 && col==n-1)break;
            if(cost > ans[row][col]) continue;
            for (int i = 0; i < 4; i++) {
                int newRow = row+r[i]; int newCol = col+c[i];
                if(newRow<0 || newRow>=m || newCol<0 || newCol>=n)continue;
                int e = Math.abs(arr[row][col]-arr[newRow][newCol]);
                e = Math.max(e,cost);
                if(ans[newRow][newCol]>e){
                    ans[newRow][newCol] = e;
                    eff.add(new Triple(newRow,newCol,e));
                }
            }
        }
        return ans[m-1][n-1];
    }

    public static void main(String[] args) {

    }
}
