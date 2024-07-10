package Student_Ao;

public class StudentA {
    int id;
    String name;
    int age;
     StudentA(int id,String name,int age) {
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