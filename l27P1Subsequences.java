package JavaCodingRestart;

import java.util.ArrayList;

public class l27P1Subsequences {
    static ArrayList<String> subsequences(String a){
        ArrayList<String> Ans = new ArrayList<>();
        if(a.length()==0){
            Ans.add("");
            return Ans;
        }
        char curr = a.charAt(0);
        ArrayList<String> subAns = subsequences(a.substring(1));
        for (String string : subAns) {
            Ans.add(string);
            Ans.add(curr+ string);
        }
        return Ans;
    }

    static void subsequences2(String a, String Curr){
        if(a.length()==0){
            System.out.println(Curr);
            return;
        }
        char b =a.charAt(0);
        String remString = a.substring(1);
        subsequences2(remString, Curr+b);
        subsequences2(remString,Curr);
        return;
    }
    public static void main(String[] args) {
        System.out.println(subsequences("abc"));
        subsequences2("abc","");
    }
}
