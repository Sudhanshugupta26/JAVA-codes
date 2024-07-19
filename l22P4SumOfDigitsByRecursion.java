package JavaCodingRestart;

public class l22P4SumOfDigitsByRecursion {
    static int sumOfDigiByRec(int n){
        if(n%10==0){
            return n;
        }
        return  n%10 + sumOfDigiByRec(n/10);
    }

    // Bonus Q
    static int digiCountByRec(int n){
        if(n%10==0){
            return 0;
        }
        return 1+digiCountByRec(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigiByRec(12345));
        //System.out.println(12343%10);
        System.out.println(digiCountByRec(12345));
    }
}
