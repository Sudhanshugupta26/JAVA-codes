package JavaCodingRestart;

public class l55Permutation1 { // without backtracking!
    // With backtracking in leetcode 46
    static void printp(String a , String t){
        if (a.equals("")) {
            System.out.println(t);
            return;
        }
        for (int i = 0; i < a.length(); i++) {
            char n = a.charAt(i);
            String left = a.substring(0, i);
            String right = a.substring(i+1);
            printp(left+right, t+n);
        }
    }
    public static void main(String[] args) {
        String a = "abc";
        printp(a, "");
    }
}
