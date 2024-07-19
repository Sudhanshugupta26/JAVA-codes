package JavaCodingRestart;

public class l23P6ArmstrongNumberByRecursion {
    static boolean isArmstrong(int n){
        int digin = digiCountByRec(n);
        if(n==armstrong(n, digin))return true;
        return false;
    }
    static int powByRec2(int base,int pow){ // Time Complexity Enhanced. Since, function call reduced. TC = O(log(pow)).
        if(pow==0)return 1;
        int smallpow=powByRec2(base, pow/2);
        if(pow%2==0){                             // when pow is even
            return smallpow*smallpow;
        }
        return base*smallpow*smallpow;           // when pow is odd
    }
    static int armstrong(int n,int digin){
        if(n==0)return 0;
        return powByRec2(n%10, digin) + armstrong(n/10, digin);
    }
    static int digiCountByRec(int n){
        if(n%10==0){
            return 0;
        }
        return 1+digiCountByRec(n/10);
    }
    public static void main(String[] args) {
        System.out.println(armstrong(9474, 4));
        System.out.println(isArmstrong(9474));
    }
}
