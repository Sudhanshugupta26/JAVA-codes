package JavaCodingRestart;

public class l55nQueens {
    public static void main(String[] args) {
        int n =4 ;
        char[][] board= new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='.';
            }
        }
        nQueens(board,0);
    }

    private static void nQueens(char[][] board, int row) {
        if (board.length==row) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board,j,row)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j]='.';  // Backtracking
            }
        }
    }

    private static boolean isSafe(char[][] board, int col, int row) {
        // check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i]=='Q') {
                return false;
            }
        }
        //check col
        for (int i = 0; i < board.length; i++) {
            if (board[i][col]=='Q') {
                return false;
            }
        }
        // diagonal NE
        int i = row;
        int j = col;
        while (i>=0 && j<board.length) {
            if (board[i][j]=='Q') {
                return false;
            }
            i--;
            j++;
        }
        // diagonal SE
        i = row;
        j = col;
        while (i<board.length && j<board.length) {
            if (board[i][j]=='Q') {
                return false;
            }
            i++;
            j++;
        }
        // diagonal SW
        i = row;
        j = col;
        while (i<board.length && j>=0) {
            if (board[i][j]=='Q') {
                return false;
            }
            i++;
            j--;
        }
        // diagonal NW
        i = row;
        j = col;
        while (i>=0 && j>=0) {
            if (board[i][j]=='Q') {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
}
