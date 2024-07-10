package Queue_nums;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Qurev {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        Queue<Integer>num= new LinkedList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        for (int i = 0; i < 4; i++) {
            stack.add(num.poll());
        }
        while(!stack.isEmpty()){
            num.offer(stack.pop());
        }
        System.out.println(num);
    }
}
