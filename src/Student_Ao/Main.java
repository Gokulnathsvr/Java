package Student_Ao;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StudentA detail[]=new StudentA[n];
        for (int i=0;i< detail.length;i++){
            System.out.println("Enter the student ID:");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the student Name:");
            String name=sc.nextLine();
            System.out.println("Enter the student Age");
            int age= sc.nextInt();
            sc.nextLine();

            detail[i]=new StudentA(id,name,age);



        }
    }
}
