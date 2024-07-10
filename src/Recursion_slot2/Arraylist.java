package Recursion_slot2;
import java.util.*;
public class Arraylist {
    public static void main(String[] args){
        ArrayList<Integer>list =new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list);
        list.set(1,2);
        System.out.println(list);

        System.out.println(list.contains(3));
        System.out.println(list.size());
        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
