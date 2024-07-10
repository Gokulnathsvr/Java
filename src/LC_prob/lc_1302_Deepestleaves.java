package LC_prob;

import java.util.*;

public class lc_1302_Deepestleaves {
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
    public static List<List<Integer>>ZigZaglevelOrder(Node root){
        boolean lefttoright = true;
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans;
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
            if(!lefttoright){
                Collections.reverse(level);
            }
            ans.add(level);
            lefttoright=!lefttoright;
        }
        return ans;

    }
    public static void printResult(List<List<Integer>>result){
        for(List<Integer>row:result){
            for(int val:row){
                System.out.print(val+"");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.left.left.left=new Node(7);
        root.left.right.left=new Node(8);

        List<List<Integer>>result=ZigZaglevelOrder(root);
        printResult(result);
        int sum=addLast(result);
        System.out.println("The sum of leaf nodes are:"+sum);
    }
    public static int addLast(List<List<Integer>> arr){
        int l=arr.size()-1;
        List<Integer>ll= arr.get(l);
        int sum=0;
        for(int i=0;i<ll.size();i++){
            sum=sum+ll.get(i);
        }
        return sum;
    }

}