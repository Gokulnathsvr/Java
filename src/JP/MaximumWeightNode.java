package JP;
import java.util.*;

public class MaximumWeightNode {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[] edge = new int[N];
            for (int i = 0; i < N; i++) {
                edge[i] = scanner.nextInt();
            }
            int[] weights = new int[N];
            for (int i = 0; i < N; i++) {
                if (edge[i] != -1) {
                    weights[edge[i]]++;
                }
            }
            int maxWeight = -1;
            int maxNode = -1;

            for (int j = 0; j < N; j++) {
                if (weights[j] > maxWeight) {
                    maxWeight = weights[j];
                    maxNode = j;
                }
            }
            System.out.println(maxNode);
        }
    }


