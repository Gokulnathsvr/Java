package LC_No_of_Island;
//island bfs
import java.util.LinkedList;
import java.util.Queue;

public class ISLAND_bfs {
    public static class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {1, 1, 0, 1}};
        ISLAND_bfs is = new ISLAND_bfs();
        System.out.println(is.islandscount(grid));
    }

    public int islandscount(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && vis[i][j] == 0) {
                    bfs(i, j, vis, grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public void bfs(int i, int j, int vis[][], int grid[][]) {
        vis[i][j] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        int n = grid.length;
        int m = grid[0].length;
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
                            && grid[nrow][ncol] == 1 && vis[nrow][ncol] == 0) {
                        vis[nrow][ncol] = 1;
                        q.add(new Pair(nrow, ncol));
                    }
                }
            }
        }
    }



