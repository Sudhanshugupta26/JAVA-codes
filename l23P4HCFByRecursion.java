package JavaCodingRestart;

public class l23P4HCFByRecursion {
    static void hcfByEuclidLemma(int a,int b){
        if(b==0){
            System.out.println(a);
            return;
        }
        hcfByEuclidLemma(b,a%b);    // let if b>a then a%b will swap the value.
        return;
    }
    public static void main(String[] args) {
        hcfByEuclidLemma(11,22);
    }
    
}