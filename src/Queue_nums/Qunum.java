package Queue_nums;

import java.util.LinkedList;
import java.util.Queue;

public class Qunum {
    public static void main(String[] args) {
        Queue<Integer> num1 = new LinkedList<>();
        Queue<Integer> num2 = new LinkedList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        num1.add(6);
        num1.add(7);
        num1.add(8);
        num1.add(9);
        num1.add(10);
        for (int i = 0; i < 5; i++) {
            num2.add(num1.poll());
        }
        while (!num2.isEmpty()){
            num1.add(num2.poll());
            num1.add(num1.remove());
    }
        System.out.println(num1);
    }
}
