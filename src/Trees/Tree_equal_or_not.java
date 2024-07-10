package Trees;

public class Tree_equal_or_not {
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean EqualorNot(Node root1, Node root2) {

        if(root1 == null && root2 == null){
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }


        return ((root1.val == root2.val) && (EqualorNot(root1.left, root2.left)) && (EqualorNot(root1.right,root2.right)));

    }



    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);

        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        boolean ans=EqualorNot(root1,root2);
        System.out.println(ans);
    }
}
