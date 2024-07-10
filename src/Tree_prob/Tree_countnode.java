package Tree_prob;

public class Tree_countnode {
    static int count = 0;

    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int x) {
            val = x;
            left = null;
            right = null;
        }

        public static void traverse(Node root) {
            if(root==null){
                return;
            }
            traverse(root.left);
            traverse(root.right);
            count++;

        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        Node.traverse(root);
        System.out.println(count);
    }
}
    


