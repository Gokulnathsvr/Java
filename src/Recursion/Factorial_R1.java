package Recursion;

public class Factorial_R1 {
    public static void main(String args[]) {
        int num = 5;
        int factorial = multiplyNumber(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }

    public static int multiplyNumber(int num) {
        if (num == 1) {
            return 1;
        }
        int fact = num * multiplyNumber(num - 1);
        return fact;
    }
}
