package Student_Ao;

public class StudentA {
    int id;
    String name;
    int age;
    public StudentA(int id,String name,int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("id:" + this.id);
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
    }

    void display() {
        System.out.println("id:" + id);
        System.out.println("name:" + name);
        System.out.println("age:" + age);
    }
}

//Main

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

