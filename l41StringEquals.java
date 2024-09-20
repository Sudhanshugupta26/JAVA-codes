package JavaCodingRestart;

public class l41StringEquals {
    public static void main(String[] args) {
        String str ="Hello" ;
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str==str1);
        System.out.println(str==str2);
        System.out.println(str.equals(str1));
        System.out.println(str.equals(str2));
    }
}
