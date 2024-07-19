package JavaCodingRestart;

public class l26P4PalindromeNumberByRecursion {
    static boolean isPalindrome(int i,int n){
        int a = numReverse(i, n);
        if(i==a)return true;
        return false;
    }
    static int numReverse(int i,int n){
        // base case
        if(i<10)return i;
        // recursion
        int a = numReverse(i/10,n-1);
        int b = i%10;
        // self work
        return b*(int)Math.pow(10, n-1) + a;
    }
    public static void main(String[] args) {
        System.out.println(numReverse(123456,6));
        System.out.println(isPalindrome(121, 3));
    }
}
