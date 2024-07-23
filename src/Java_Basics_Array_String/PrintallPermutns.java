package Java_Basics_Array_String;

public class PrintallPermutns {
    public static void printallPermutns(String str, String str2) {
        if (str.length() == 0) {
            System.out.print(str2 + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String str3 = str.substring(0, i) + str.substring(i + 1);
            printallPermutns(str3, str2 + ch);
        }
    }
    public static void main(String[] args)
    {
        String s = "cat";
        printallPermutns(s, "");
    }
}

