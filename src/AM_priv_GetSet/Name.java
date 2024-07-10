package AM_priv_GetSet;

public class Name {
    private String Name;
    private int Id;
    private double Marks;

    Name(String name,int Id,double Marks){
        this.Name=name;
        this.Id=Id;
        this.Marks=Marks;
    }

    public void getData(){
        System.out.println(Name+","+Id+","+Marks);
    }

}
