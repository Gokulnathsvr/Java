package LC_No_of_Island;
//island dfs
public class ISLAND_dfs {
    public  class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {1, 1, 0, 1}};
        ISLAND_dfs is = new ISLAND_dfs();
        System.out.println(is.islandscount(grid));
    }
    public int islandscount(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && vis[i][j] == false) {
                    dfs(i, j, vis, grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(int i, int j, boolean[][] vis, int[][] grid){
        vis[i][j]=true;
        int n = grid.length;
        int m = grid[0].length;
        int drow[] ={-1,0,1,0};
        int dcol[] ={0,1,0,-1};
        for(int k=0;k<4;k++){
            int nrow = i + drow[k];
            int ncol = j + dcol[k];
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
                    && grid[nrow][ncol] == 1 && vis[nrow][ncol] == false){
                dfs(nrow,ncol,vis,grid);

            }

        }
    }
}
