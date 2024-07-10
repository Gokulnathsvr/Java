package Recursion_slot2;

import java.util.Stack;

public class Rev_str {
    //Reverse String Using Stack
    public static void main(String[] args){
        String s = "hello";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++)
            stack.push(s.charAt(i));
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();

        }
    }
}
