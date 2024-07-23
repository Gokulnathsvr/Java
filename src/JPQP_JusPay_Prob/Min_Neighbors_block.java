package JPQP_JusPay_Prob;

import java.util.*;

public class Min_Neighbors_block {

    // BFS Method to find minimum neighbors to block
    public static ArrayList<Integer> block(HashMap<Integer, ArrayList<Integer>> graph, int source, int target) {
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visitedNodes = new HashSet<>();
        ArrayList<Integer> blockedList = new ArrayList<>();

        // Start BFS from the source node
        queue.add(source);
        visitedNodes.add(source);

        while (!queue.isEmpty()) {
            int node = queue.poll();

            // Traverse neighbors of the current node
            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visitedNodes.contains(neighbor)) {
                    if (neighbor == target) {
                        blockedList.add(node);
                    } else {
                        queue.add(neighbor);
                    }
                    visitedNodes.add(neighbor);
                }
            }
        }

        return blockedList;
    }

    public static void main(String[] args) {
        // Example graph initialization
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        graph.put(2, new ArrayList<>(List.of(6)));
        graph.put(5, new ArrayList<>(List.of(2)));
        graph.put(7, new ArrayList<>(List.of(5)));
        graph.put(9, new ArrayList<>(List.of(7)));

        int source = 9;
        int target = 6;

        // Find minimum neighbors to block
        ArrayList<Integer> neighborsToBlock = block(graph, source, target);

        System.out.println("Minimum neighbors to block to make " + target + " unreachable from " + source + ":");
        System.out.println(neighborsToBlock);
    }
}
