package JavaCodingRestart;

public class l23P5LCMByP4 {
    static int lcm(int x,int y){

        // LCM*HCF=X*Y

        return (x*y)/hcfByEuclidLemma(x, y);
    }
    static int hcfByEuclidLemma(int a,int b){
        if(b==0){
            return a;
        }    // let if b>a then a%b will swap the value.
        return hcfByEuclidLemma(b,a%b);
    }
    public static void main(String[] args) {
        System.out.println(hcfByEuclidLemma(11,17));
        System.out.println(lcm(11, 17));
    }
}
