package Test_25_4_24;
import java.util.Scanner;
public class OnRoadPrice {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] input = scanner.nextLine().split(",");

            String type = input[0];
            double basePrice = Double.parseDouble(input[3]);
            double tax = 0;

            if (type.equals("Hatchback")) {
                tax = basePrice * 0.02;
            } else if (type.equals("Sedan")) {
                tax = basePrice * 0.03;
            } else if (type.equals("SUV")) {
                tax = basePrice * 0.04;
            }

            if (Integer.parseInt(input[4]) > 1500) {
                tax += basePrice * 0.03;
            }

            if (input[5].equals("Petrol")) {
                tax += basePrice * 0.02;
            } else if (input[5].equals("Diesel")) {
                tax += basePrice * 0.04;
            } else if (input[5].equals("Electric")) {
                tax -= basePrice * 0.05;
            }

            int onRoadPrice = (int) (basePrice + tax);
            System.out.println("On-Road Price: " + onRoadPrice);
        }
    }
