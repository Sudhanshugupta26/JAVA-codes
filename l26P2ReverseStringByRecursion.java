package JavaCodingRestart;

public class l26P2ReverseStringByRecursion {
    static String reverseString(String a){      // this works but s.substring() takes O(n) whether with index O(1).
        if(a.length()==0){
            return "";
        }
        String ans = reverseString(a.substring(1));
        char c = a.charAt(0);
        return ans+c;
    }
    public static void main(String[] args) {
        System.out.println(reverseString("SUDHANSHU"));
    }
}
