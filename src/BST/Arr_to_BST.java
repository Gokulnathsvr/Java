package BST;

public class Arr_to_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Node convertToBST(int arr[], int st, int end) {
        if (st > end) {
            return null;
        }
        int mid = (st + end) / 2;
        Node curr = new Node(arr[mid]);
        curr.left = convertToBST(arr, st, mid - 1);
        curr.right = convertToBST(arr, mid + 1, end);
        return curr;
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        Node root=convertToBST(arr,0,arr.length-1);
        inorder(root);

    }

}
