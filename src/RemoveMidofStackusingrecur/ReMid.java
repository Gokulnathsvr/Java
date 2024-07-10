package RemoveMidofStackusingrecur;

import java.util.Stack;

public class ReMid {
    static Stack<Integer> stack = new Stack<>();
    public static void deleteMiddle(int sizeofstack,int current){
        if(current==sizeofstack/2){
            stack.pop();
            return;
        }
        int topElement = stack.pop();
        deleteMiddle(sizeofstack,current+1);
        stack.push(topElement);
    }
    public static void main(String[] args){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Original Stack"+stack);
        int sizeofstack=stack.size();
        deleteMiddle(sizeofstack,0);
        System.out.println("Stack after deleting middle elements"+stack);
    }
}
