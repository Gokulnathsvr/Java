package Trees;

public class Symmetric_Lc_101 { public static class Node {
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


        return ((root1.val == root2.val) && (EqualorNot(root1.left, root2.right)) && (EqualorNot(root1.right,root2.left)));

    }
    public static boolean isSymmetric(Node root){
    if(root==null){
        return true;

    }
    return EqualorNot(root.left,root.right);
    }



    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(2);
        root1.left.left = new Node(4);
        root1.right.right=new Node(4);
        root1.left.right = new Node(5);
        root1.right.left=new Node(5);

        boolean ans =isSymmetric(root1);
        System.out.println(ans);
    }
}
