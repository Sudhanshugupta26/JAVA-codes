package JavaCodingRestart;

public class l22P3FibboncciByRecursion {
    static int fiboByRec(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fiboByRec(n-1) + fiboByRec(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fiboByRec(i));
        }
    }
}
