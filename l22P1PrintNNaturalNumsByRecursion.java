package JavaCodingRestart;

public class l22P1PrintNNaturalNumsByRecursion {
    static void nNaturalNumsByRecursion(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        else{
            nNaturalNumsByRecursion(n-1);
            System.out.print(n+" ");
            return;
        }
    }
    public static void main(String[] args) {
        nNaturalNumsByRecursion(10);
    }
}
