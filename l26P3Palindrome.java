package JavaCodingRestart;

public class l26P3Palindrome {
    
    static void palindrome(String a){
        String demo = reverseString(a);
        if (a.equals(demo)) {   // to compare strings we use method .equals()
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
        return;
    }
    static String reverseString(String a){
        if(a.length()==0){
            return "";
        }
        String ans = reverseString(a.substring(1));
        char c = a.charAt(0);
        return ans+c;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("SUDHANSHU"));
        palindrome("no");
        //palindorme2("daad");

    }
}
