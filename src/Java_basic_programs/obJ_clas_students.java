//Students.java

public class Students {

    int id;
    String name;
}

//Main.java

public class Main {
    public static void main(String[] args) {
    Students s1=new Students();
    Students s2=new Students();
    Students s3=new Students();
    s1.id=10;
    s2.id=20;
    s3.id=25;
    s1.name="Arun";
    s2.name="Raj";
    s3.name="Jack";
    System.out.println(s1.id);
    System.out.println(s1.name);
    System.out.println(s2.id);
    System.out.println(s2.name);
    System.out.println(s3.id);
    System.out.println(s3.name);

    }
}

