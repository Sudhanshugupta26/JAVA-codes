package JavaCodingRestart;

public class l23P1FirstKMultiplesByRecursion {
    static void firstMultiples(int num, int mult){
        if(mult==0)return;
        firstMultiples(num, mult-1);
        System.out.println(num*mult);
        return;
    }
    public static void main(String[] args) {
        firstMultiples(2, 8);
    }
}
