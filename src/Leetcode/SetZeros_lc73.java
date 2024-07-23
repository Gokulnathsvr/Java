package Leetcode;
import java.util.Scanner;
public class SetZeros_lc73 {

        public static void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            boolean[] rows = new boolean[m];
            boolean[] cols = new boolean[n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j] == 0) {
                        rows[i] = true;
                        cols[j] = true;
                    }
                }
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (rows[i] || cols[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[][] matrix = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            setZeroes(matrix);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


