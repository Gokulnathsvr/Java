package Rectangle;


public class Main {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        r1.insertRecord(11, 13);
        r2.insertRecord(21, 25);
        r3.insertRecord(21, 27);
        r1.displayInformation();
        r2.displayInformation();
        r2.displayInformation();
    }
}
