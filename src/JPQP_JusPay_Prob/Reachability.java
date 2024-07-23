package JPQP_JusPay_Prob;
import java.util.*;

//Reachable Nodes
public class Reachability {
    private static int V;
    private static List<List<Integer>> adj;
    private static boolean[] visited;

    public static void addEdge(int v, int w) {
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    public static List<Integer> BFS(int componentNum,
                                    int src) {
        List<Integer> queue = new ArrayList<>();
        queue.add(src);
        visited[src] = true;
        List<Integer> reachableNodes = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.remove(0);
            reachableNodes.add(u);
            for (int itr : adj.get(u)) {
                if (visited[itr] == false) {
                    visited[itr] = true;
                    queue.add(itr);
                }
            }
        }
        return reachableNodes;
    }

    public static void
    displayReachableNodes(List<Integer> m) {
        for (int i : m) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void findReachableNodes(int[] arr, int n) {
        List<Integer> a = new ArrayList<>();
        int componentNum = 0;
        for (int i = 0; i < n; i++) {
            int u = arr[i];
            if (visited[u] == false) {
                componentNum++;
                a = BFS(componentNum, u);
            }
            System.out.println("Reachable Nodes from " + u
                    + " are");
            displayReachableNodes(a);
        }
    }

    public static void main(String[] args) {
        V = 7;
        adj = new ArrayList<>();
        for (int i = 0; i < V + 1; i++) {
            adj.add(new ArrayList<>());
        }
        visited = new boolean[V + 1];
        addEdge(1, 2);
        addEdge(2, 3);
        addEdge(3, 4);
        addEdge(3, 1);
        addEdge(5, 6);
        addEdge(5, 7);
        int[] arr = {2, 4, 5};
        int n = arr.length;
        findReachableNodes(arr, n);
    }

}
