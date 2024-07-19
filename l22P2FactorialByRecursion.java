package JavaCodingRestart;

public class l22P2FactorialByRecursion {
    static int factByRec(int n){
        if(n==0) return 1;
        return n*factByRec(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factByRec(5));
    }
}
