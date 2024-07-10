package LC_prob;

import java.util.ArrayList;

public class lc_21 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node sorting(Node h1, Node h2) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        while (h1 != null) {
            arrlist.add(h1.data);
            h1 = h1.next;
        }
        while (h2 != null) {
            arrlist.add(h2.data);
            h2 = h2.next;
        }
        return h1;
    }
    public static void main(String[] args) {
        Node h1 = new Node(1);
        h1.next = new Node(2);
        h1.next.next = new Node(4);

        Node h2=new Node(1);
        h2.next=new Node(3);
        h2.next.next=new Node(4);

        System.out.println(sorting(h1,h2));

    }
}
