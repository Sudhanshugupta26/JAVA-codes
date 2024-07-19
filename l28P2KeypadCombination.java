package JavaCodingRestart;

public class l28P2KeypadCombination {
    static void keyPCombination(String digi,String keyP[],String remaining){
        if(digi.length()==0){
            System.out.println(remaining);
            return;
        }
        char a = digi.charAt(0);
        int num = a - '0';
        for (int i = 0;i<keyP[num].length();i++) {
            keyPCombination(digi.substring(1), keyP, remaining+keyP[num].charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = "77";
        String keyP[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //               0  1    2     3     4     5     6     7      8     9
        keyPCombination(s, keyP, "");
    }
}
