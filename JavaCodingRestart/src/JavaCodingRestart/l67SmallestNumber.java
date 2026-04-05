package JavaCodingRestart;

public class l67SmallestNumber {
    public static void main(String[] args) {
        int S = 43; // Sum of digits
        int D = 7;  // Digit length
        if(S==0 || S>(D*9)) return;
        int ans = 0;
        S-=1;   // Saving 1 for the first digit if Sum becomes 0 before reaching the digit length.
        for (int i = 0; i < D-1; i++) {
            if(S==0){
                break;
            }else{
                if (S>=9){
                    ans = ans + 9*(int)Math.pow(10,i);
                    S-=9;
                }else{
                    ans = ans + S*(int)Math.pow(10,i);
                    S=0;
                }
            }
        }
        System.out.println(ans+((S+1)*(int)Math.pow(10,D-1)));
    }
}
