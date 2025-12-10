package JavaCodingRestart;

public class l55BacktrackingObstacleMaze {
    public static void main(String[] args) {    
        int row=3;
        int cols=4;
        int obstacle[][] = {{1,0,1,1},  // There are obstacles inside the maze and can't be traverse.
                            {1,1,1,1},
                            {1,1,0,1}};
        printMaze4D(0,0,row-1,cols-1,"",obstacle);   // Backtracking implenmentation
    }

    private static void printMaze4D(int sr, int sc, int er, int ec, String string, int[][] isVisited) { // for all 4 direction
        if (sr<0 || sc<0) return;
        if(sr>er || sc>ec)return;
        if(isVisited[sr][sc]==0)return;
        if(isVisited[sr][sc]==-1)return;
       if (er==sr && ec==sc) {
            System.out.println(string);;
            return;
        }
        //checking the box visited
        isVisited[sr][sc]=-1;

        // for going down
        printMaze4D(sr+1, sc, er, ec, string+"D",isVisited);
        //for going right
        printMaze4D(sr, sc+1, er, ec, string+"R",isVisited);
        //for going up
        printMaze4D(sr-1, sc, er, ec, string+"U",isVisited);
        //for going left
        printMaze4D(sr, sc-1, er, ec, string+"L",isVisited);

        //BackTracking: Unchecking all the boxes visited so far for next iterattion.
        isVisited[sr][sc]=1;
    }
}
