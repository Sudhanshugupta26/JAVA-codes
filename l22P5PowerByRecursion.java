package JavaCodingRestart;

public class l22P5PowerByRecursion {
    static int powByRec(int base,int pow){  // Time Complexity is high. TC = O(pow).
        if(pow==0)return 1;
        return base*powByRec(base, pow-1);
    }

    static int powByRec2(int base,int pow){ // Time Complexity Enhanced. Since, function call reduced. TC = O(log(pow)).
        if(pow==0)return 1;
        int smallpow=powByRec2(base, pow/2);
        if(pow%2==0){                             // when pow is even
            return smallpow*smallpow;
        }
        return base*smallpow*smallpow;           // when pow is odd
    }
    public static void main(String[] args) {
        System.out.println(powByRec(2, 5));
        System.out.println(powByRec2(4, 4));
    }
}
