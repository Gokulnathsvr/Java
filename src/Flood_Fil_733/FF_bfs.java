package Flood_Fil_733;
//Flood fill bfs
import java.util.LinkedList;
import java.util.Queue;

public class FF_bfs {
    public class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int sr = 1;
        int sc = 0;
        int color = 2;
        FF_bfs is = new FF_bfs();
        int[][]res=is.floodFill(image, sr, sc, color);
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res.length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][]ans=bfs(image, sr, sc, color);
        return ans;
    }
    public int[][] bfs(int[][] image, int sr, int sc, int color) {
        image[sr][sc] = color;
        Queue< Pair> q = new LinkedList<>();
        q.add(new Pair(sr, sc));
        int n = image.length;
        int m = image[0].length;
        int drow[] = {-1,0,1,0};
        int dcol[] = {0,1,0,-1};

        while (!q.isEmpty()) {
            int row = q.peek().row;
            int col = q.peek().col;
            q.remove();


            for (int k=0;k<4;k++){
                int nrow = row + drow[k];
                int ncol = col + dcol[k];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                        && image[nrow][ncol] == sc ) {
                    image[nrow][ncol] = color;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }
        return image;
    }
}

