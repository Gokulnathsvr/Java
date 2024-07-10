package LC_prob;

public class LC_700_Search_BT {
  static class TreeNode {
        int data;
    TreeNode left;
    TreeNode right;

        public TreeNode(int data) {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
       public static TreeNode searchBST(TreeNode root, int data) {
        if (root == null || root.data == data) {
            return root;
        }

        if (data < root.data) {
            return searchBST(root.left, data);
        }
        else {
            return searchBST(root.right, data);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int data = 2;
        LC_700_Search_BT solution = new LC_700_Search_BT();
        TreeNode result = solution.searchBST(root, data);

        printTree(result);

    }

    public static void printTree(TreeNode root) {
        if (root == null) return;
        printTree(root.left);
        System.out.print(root.data+ " ");
        printTree(root.right);
    }
}

