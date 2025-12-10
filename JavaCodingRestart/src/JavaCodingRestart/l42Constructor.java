package JavaCodingRestart;

public class l42Constructor {
    public static class Constructor {
        int rno;
        String name;
        double precentage;
        public Constructor(int i, String string, double d) {    // This is a Constructor
            //TODO Auto-generated constructor stub
            rno = i;
            name = string;
            precentage = d;
        }
    }
    public static void main(String[] args) {
        Constructor s1 = new Constructor(29,"Sudhanshu",92.2);
        System.out.println(s1.name);
    }
}
