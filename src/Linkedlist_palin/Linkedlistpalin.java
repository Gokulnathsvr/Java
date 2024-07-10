package Linkedlist_palin;
import java.util.Stack;

 public class Linkedlistpalin {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public static boolean isPalindrome(Node head) {
            Stack<Integer> st = new Stack<>();
            Node temp = head;
            while (temp != null) {
                st.push(temp.data);
                temp = temp.next;
            }
            temp = head;
            while (temp != null) {
                if (temp.data != st.peek()) {
                    return false;
                }
                st.pop();
                temp = temp.next;

            }
            return true;
        }

            public static void main(String[]args){
                Node head = new Node(1);
                head.next = new Node(5);
                head.next.next = new Node(2);
                head.next.next.next = new Node(5);
                head.next.next.next.next = new Node(1);
                System.out.println("Original linked List");
                if (isPalindrome(head)) {
                    System.out.println("The Linkedlist is Palindrome");
                } else {
                    System.out.println("The LinkedList in not Palindrome");
                }
        }
    }

