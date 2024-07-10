    package LC_prob;

    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Queue;

    public class lc_515 {
        static class Node {
            int data;
            Node right;
            Node left;

            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        public static List<List<Integer>> Largestvalrow(Node root) {
            List<List<Integer>> ans = new ArrayList<>();

            if (root == null) {
                return ans;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> level = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    Node node = q.poll();
                    level.add(node.data);
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }

                }ans.add(level);
            }
            return ans;
        }

        public static void large(List<List<Integer>> arr){

            for (int i = 0; i < arr.size(); i++) {
                int max = 0;
                List<Integer> larr = arr.get(i);
                for (int j = 0; j < larr.size(); j++) {
                    if (max < larr.get(j)) {
                        max = larr.get(j);
                    }
                }
                System.out.println(max);
            }
        }

        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(3);
            root.right = new Node(2);
            root.left.left = new Node(5);
            root.left.right = new Node(3);
            root.right.right = new Node(9);
            List<List<Integer>> res = Largestvalrow(root);
            System.out.println(res);
            large(res);
        }
    }


/*

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class lc_515 {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> largestValues(Node root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (node.data > max) {
                    max = node.data;
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(max);
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(9);

        List<Integer> largestValues = largestValues(root);
        System.out.println("Largest values in each row:");
        for (Integer val : largestValues) {
            System.out.println(val);
        }
    }
}
*/


