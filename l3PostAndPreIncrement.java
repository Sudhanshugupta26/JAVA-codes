package JavaCodingRestart;

public class l3PostAndPreIncrement {
    public static void main(String[] args) {
        int x =10;
        int y =++x; //11
        int z =x++; //still 11 ,since 1st assign then increment.
        System.out.println(x+" "+y+" "+z);// x=12 since incremented.
    }   
}
