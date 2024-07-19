package JavaCodingRestart;

public class l26P1RemoveCharacterFromStringByRecursion {
    static String removeEleFromString2(String a){
        if (a.length()==0) {
            return "";
        }
        String ans = removeEleFromString2(a.substring(1));
        if (a.charAt(0)!='a') {
            char let = a.charAt(0);
            return let+ans;             // TC of this step is O(n), concatenation of two string is not const and depends on string.
        }
        return ans;
    }

    static String removeEleFromString(String a,int idx){
        if(a.length()==idx){
            return "";
        }
        String ans = removeEleFromString(a, idx+1);
        if (a.charAt(idx)!='a') {
            return a.charAt(idx)+ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        String a = "sudhanshu";
        System.out.println(removeEleFromString(a, 0));
        System.out.println(removeEleFromString2(a));
    }
}
