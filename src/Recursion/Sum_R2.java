package Recursion;

public class Sum_R2 {
    public static void main(String args[]) {
        int num = 5;
        int SumNum = SumNumber(num);
        System.out.println("Sum of " + num + " = " + SumNum);
    }

    public static int SumNumber(int num) {
        if (num == 1) {
            return 1;
        }
        int sum = num + SumNumber(num - 1);
        return sum;
    }
}
