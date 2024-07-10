package Trees;

import java.util.*;

public class Tree_height {
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
    public static void Tree_height(Node root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            System.out.println("-1");
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for (int i=0;i<size;i++){
                Node node=q.poll();
                level.add(node.data);
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            ans.add(level);
        }
        System.out.println(ans.size());

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.right.right.right= new Node(6);
        Tree_height(root);
    }
}
