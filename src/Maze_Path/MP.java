package Maze_Path;

public class MP {
    static int cnt=0;
    public static int Path(int n,int row,int col,String ans){
        if(row==n && col==n){
            System.out.println(ans);
            cnt++;
        }
        if(row>n || col>n){
            return 0;
        }
        Path(n,row,col+1,ans+"H");
        Path(n,row+1,col,ans+"V");
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(Path(2,0,0,""));
    }
}
