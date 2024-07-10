package LC_prob;

import java.util.Scanner;

public class LC_542_01Matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        char[][] arr=new char[n][m];
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String[] a = str.split(" ");
            for(int j=0;j<m;j++){
                arr[i][j]=a[j].charAt(0);
            }
        }
        for(char[] it:arr){
            for(int i=0;i<n;i++){
                System.out.print(it[i]+" ");
            }
            System.out.println();
        }
    }
}
