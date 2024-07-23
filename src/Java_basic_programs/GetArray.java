import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String args[]) {
      System.out.println("Enter the required size of the array: ");
      Scanner s = new Scanner(System.in);
      int size1 = s.nextInt();
      System.out.println("Enter the required size of the array: ");
      int size2 = s.nextInt();
      System.out.println("Enter the elements of the array one by one ");
      int myArray1[] = new int [size1];
      System.out.println("Enter the elements of the array one by one ");
      int myArray2[] = new int [size2];
      for(int i=0; i<size1; i++) {
         myArray1[i] = s.nextInt();
      }
      for(int j=0;j<size2;j++){
          myArray2[j]=s.nextInt();
      }
      System.out.println("========================");
      for(int num:myArray1){
          System.out.println(num);
      }
      for(int num1:myArray2){
          System.out.println(num1);
      }
     
}
}


