package LC_prob;

public class LC_112_Pathsum {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean hasPathSum(Node root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return root.data == sum;
        }

        boolean leftPath = hasPathSum(root.left, sum - root.data);
        boolean rightPath = hasPathSum(root.right, sum - root.data);

        return leftPath || rightPath;
    }

    public static void main(String[] args) {
        int target = 22;
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.right.right = new Node(1);

        boolean ans = hasPathSum(root, target);
        System.out.println(ans);
    }

}
