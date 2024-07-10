package Test_25_4_24;
import java.util.Scanner;
public class Area {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int shape = scanner.nextInt();

            switch (shape) {
                case 1:
                    System.out.println("Enter the length and width of the Rectangle:");
                    int length = scanner.nextInt();
                    int width = scanner.nextInt();
                    System.out.println("Area of Rectangle: " + (length * width));
                    break;
                case 2:
                    System.out.println("Enter the radius of the Circle:");
                    int radius = scanner.nextInt();
                    System.out.println("Area of Circle: " + (3.14 * radius * radius));
                    break;
                case 3:
                    System.out.println("Enter the base and height of the Triangle:");
                    int base = scanner.nextInt();
                    int height = scanner.nextInt();
                    System.out.println("Area of Triangle: " + (0.5 * base * height));
                    break;
                default:
                    System.out.println("Invalid shape selected.");
            }
        }
    }

