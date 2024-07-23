package Trees;

import java.util.LinkedList;
import java.util.Queue;


public class LevelOrder_Tree {

    public static class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void Levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node newNode = queue.poll();
            System.out.println(newNode.data + "");
            if (newNode.left != null) {
                queue.add(newNode.left);
            }
            if (newNode.right != null) {
                queue.add(newNode.right);
            }
        }
    }
        public static void main (String[]args){
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.right=new Node(6);
            root.right.left = new Node(7);
            root.left.left.left = new Node(8);
            root.right.right.right=new Node (9);
            Levelorder(root);
        }
    }

