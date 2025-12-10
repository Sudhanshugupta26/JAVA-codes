package JavaCodingRestart;

public class l41PalindromeCount {
    public static void main(String[] args) {
        String src = "abc";
        int count = 0;
        for (int i = 0; i < src.length(); i++) {
            for (int j = i+1; j < src.length()+1; j++) {
                String str = src.substring(i, j);
                StringBuilder gtr = new StringBuilder(str);
                System.out.println(str);
                String str2 = gtr.reverse()+"";// converts gtr to normal string
                if (str.equals(str2)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
