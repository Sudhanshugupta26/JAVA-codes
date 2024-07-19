package JavaCodingRestart;

public class l18P3PascalTriangle {
    static void PascalTriangle(int a){
        if(a<0){
            System.out.println("invalid");
            return;
        }
        for(int i =0;i<=a;i++){
            for(int k=0;k<(a-i);k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(Combination(i, j)+" ");
            }
            System.out.println();
        }
    }

    static int Combination(int a, int i){
        int comb = fact(a)/(fact(a-i)*fact(i));
        return comb;
    }
    static int fact(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        PascalTriangle(5);
    }
}
