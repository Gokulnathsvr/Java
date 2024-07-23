package Java_Basics_Array_String;

public class Stringbuilder {
        public static void main(String []args)
        {
            StringBuilder stbu=new StringBuilder();
            System.out.println(stbu.capacity()); //capacity
            String str="Hello";
            System.out.println(str);
            String str1 = new String("World");
            System.out.println(str1);
            str1 += " Articles";
            System.out.println(str1);
        }
    }

