package JavaCodingRestart;

public class l23P2SumOfNumberWithAltSignsByRecursion {
    static int sumWithAltSigns(int n){
        if(n==0)return 0;
        if(n%2==0)return sumWithAltSigns(n-1)-n;
        return sumWithAltSigns(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(sumWithAltSigns(5));
    }
}
