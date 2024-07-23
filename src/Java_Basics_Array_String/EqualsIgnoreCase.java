package Java_Basics_Array_String;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println(isEqualIgnoreCase);
    }
}
