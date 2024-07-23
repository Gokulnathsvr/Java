package Leetcode;

import java.util.Scanner;

public class Reversestr_lc7 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int reverse = 0;
        while (num != 0) {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);
    }
}



