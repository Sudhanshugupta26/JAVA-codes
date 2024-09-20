package JavaCodingRestart;

public class l41AlphaCountInWordProblem {
    public static void main(String[] args) {
        StringBuilder src = new StringBuilder("aaaabbbcccccddee");
        int count=0;
        String ans=""+src.charAt(0);
        for (int i = 1; i < src.length(); i++) {
            if (src.charAt(i) == src.charAt(i-1)) {
                count++;
            }else{
                ans+=(count+1);
                count=0;
                ans+=src.charAt(i);
            }
        }
        ans+=(count+1);
        System.out.println(ans);
    }
}
