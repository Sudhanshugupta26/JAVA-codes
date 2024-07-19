package JavaCodingRestart;
import java.util.*;

/**
 * demo
 */
class demo {
    int a =100;
    public void inc(){
        a=12312;
    }
    public void pr(){
        System.out.println(a);
    }
}


public class Main {
    static int firstUniqChar(String s) {
        for(int i = 0;i<s.length()-1;i++){
            char a = s.charAt(i);
            for(int j=1;j<s.length();j++){
                char b = s.charAt(j);
                if(a==b){
                    break;
                }
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        demo ob = new demo();
        ob.pr();
        ob.inc();
        ob.pr();
        int arr[] = new int[10];
        int top=1;
        arr[top--]=3;
        System.out.println(arr[1]+" "+top);
        String s = "Sersdof";
        System.out.println(s.substring(1));
        char a = s.charAt(1);
        System.out.println(firstUniqChar("sudhanshu"));

            
        
    }
}