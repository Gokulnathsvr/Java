import java.util.Scanner;

public class IncrementDecrementOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of operations: ");
        int n = scanner.nextInt();
        String[] operations = new String[n];
        for (int i = 0; i < n; i++) {
            operations[i] = scanner.next();
        }

        int result = finalValueAfterOperations(operations);
        System.out.println(result);
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                X++;
            } else {
                X--;
            }
        }
        return X;
    }
}


