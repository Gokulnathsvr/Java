package Recursion_slot2;
import java.util.*;
public class Rev {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<>();
        stack.push("h");
        stack.push("e");
        stack.push("l");
        stack.push("l");
        stack.push("o");
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
