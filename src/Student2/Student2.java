package Student2;

public class Student2 {
    int rollno;
    String name;
    void insertRecord(int r,String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(rollno+" "+name);
    }
}
