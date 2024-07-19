package JavaCodingRestart;

public class l14P1SwapingVariable {
    static void swap(int a,int b){
        System.out.println("a: "+a+" & b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a+" & b: "+b);
    }
    public static void main(String[] args) {
        int a=9 , b=8;
        swap(a, b);
        System.out.println(a+" "+b);
    }
}
