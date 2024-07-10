package LC_Nqueen2_52;

public class nq2 {
    static int count = 0;

    public static void main(String[] args) {
        Nqueen(new boolean[4][4], 0, " ");
        System.out.println(count);
    }

    public static void Nqueen(boolean[][] board, int row, String ans) {
        if (row == board.length) {
            System.out.println(ans);
            count++;
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isItSafeToPlaceQueen(board, row, col)) {
                board[row][col] = true;
                Nqueen(board, row + 1, ans + "[" + row + "-" + col + "]");
                board[row][col] = false;
            }
        }
    }
        public static boolean isItSafeToPlaceQueen(boolean[][] board, int row, int col){
            int r = row-1;
            int c = col;
            while (r >= 0) {
                if (board[r][c]) {
                    return false;
                }
                r--;
            }
            r=row;
            c=col-1;
            while(c>=0){
                if(board[r][c]){
                    return false;
                }
                c--;
            }
            r=row-1;
            c=col-1;
            while(r>=0 && c>=0){
                if(board[r][c]){
                    return false;
                }
                r--;
                c--;
            }
            r=row-1;
            c=col+1;
            while(r>=0 && c< board[0].length) {
                if (board[r][c]){
                    return false;
                }
                r--;
                c++;
            }
            return true;
    }

}






