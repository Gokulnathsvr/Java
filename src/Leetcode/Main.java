package Leetcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word1 = scanner.nextLine().split(" ");
        String[] word2 = scanner.nextLine().split(" ");

        boolean result = arrayStringsAreEqual(word1, word2);
        System.out.println(result);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}

