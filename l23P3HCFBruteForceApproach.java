package JavaCodingRestart;

public class l23P3HCFBruteForceApproach {
    static void hcf(int a, int b){
        if(a<=b){
            for (int i = a; 0<i ;i--) {
                if(a%i==0 && b%i==0){
                    System.out.println(i);
                    return;
                }
            }
        }
        else{
            for (int i = b; i > 0;i--){
                if(a%i==0 && b%i==0){
                    System.out.println(i);
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        hcf(16, 12);
    }
}
