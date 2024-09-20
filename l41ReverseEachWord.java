package JavaCodingRestart;

public class l41ReverseEachWord {
    public static void main(String[] args) {
        String str = "I am a Student",ans="";
        StringBuilder src = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                src.append(str.charAt(i));
            }else{
                src.reverse();
                ans = ans + src + " ";
                src = new StringBuilder("");
            }
        }
        src.reverse();
        ans+=src;
        System.out.println(ans);
    }
}
