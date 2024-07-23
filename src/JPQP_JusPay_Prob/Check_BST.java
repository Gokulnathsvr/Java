package JPQP_JusPay_Prob;

public class Check_BST {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static boolean isValidBST(Node root){
        return CheckBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public static boolean CheckBST(Node root,long min,long max) {
        if (root == null)
            return true;
        if (root.data <= min || root.data >= max) return false;

        if (CheckBST(root.left, min, root.data) && CheckBST(root.right, root.data,
                max)) {
            return true;
        }
        return false;

    }
    public static void main(String[] args){
        Node root = new Node(7);
        root.left = new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(15);
        Check_BST ob =new Check_BST();
        boolean ans = isValidBST(root);
        if(ans==true){
            System.out.print("Valid BST");
        }else {
            System.out.print("Invalid BST");
        }
    }
}
