package JavaCodingRestart;
public class l55BackTrackingRatMaze {
    public static void main(String[] args) {    
        int row=3;
        int cols=3;
        printMaze(1,1,row,cols,"");
        System.out.println("-------------------");
        boolean[][] isVisited = new boolean[row][cols]; //by default all values are false
        // above array is created to check the box of matrix so that a rat can't comeback on same box.
        printMaze4D(0,0,row-1,cols-1,"",isVisited);   // Backtracking implenmentation
    }

    private static void printMaze4D(int sr, int sc, int er, int ec, String string, boolean[][] isVisited) { // for all 4 direction
        if (sr<0 || sc<0) return;
        if(sr>er || sc>ec)return;
        if(isVisited[sr][sc]==true)return;
       if (er==sr && ec==sc) {
            System.out.println(string);;
            return;
        }
        //checking the box visited
        isVisited[sr][sc]=true;

        // for going down
        printMaze4D(sr+1, sc, er, ec, string+"D",isVisited);
        //for going right
        printMaze4D(sr, sc+1, er, ec, string+"R",isVisited);
        //for going up
        printMaze4D(sr-1, sc, er, ec, string+"U",isVisited);
        //for going left
        printMaze4D(sr, sc-1, er, ec, string+"L",isVisited);

        //BackTracking: Unchecking all the boxes visited so far for next iterattion.
        isVisited[sr][sc]=false;
    }

    private static void printMaze(int sr, int sc, int er, int ec, String string) {// only 2 direction
       if(sr>er || sc>ec)return;
       if (er==sr && ec==sc) {
            System.out.println(string);;
            return;
        }
        // for going down
        printMaze(sr+1, sc, er, ec, string+"D");
        //for going right
        printMaze(sr, sc+1, er, ec, string+"R");
    }
}
