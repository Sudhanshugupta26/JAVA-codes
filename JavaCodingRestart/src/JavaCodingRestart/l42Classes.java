package JavaCodingRestart;

public class l42Classes {
    // Creating a new datatype.
    public static class Student {
        String name;
        int rno;
        double precentage;
    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Sudhanshu";
        x.rno=29;
        x.precentage=92.5;
        System.out.println(x.name+" "+x.precentage+" "+x.rno);
    }
}
