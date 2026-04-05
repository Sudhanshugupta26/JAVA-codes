package JavaCodingRestart;

import java.util.ArrayList;
import java.util.List;

public class l66LargestPalindromeNumberPossible {
    public static void main(String[] args) {
        String number = "122222221";
        int n = number.length();
        List<Integer> frequency = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            frequency.add(0);
        }
        System.out.println(frequency);

        for (int i = 0; i < n; i++) {
            int digit = number.charAt(i) - '0';
            frequency.set(digit, frequency.get(digit)+1);
        }
        if (!validate(frequency)){
            System.out.println("Not a palindrome");
            return;
        }

        String firstHalf = "";
        for (int i = 9; i >=0 ; i--) {
            while (frequency.get(i) > 1) {
                firstHalf += i;
                frequency.set(i, frequency.get(i)-2);
            }
        }

        StringBuilder sb = new StringBuilder(firstHalf);
        sb.reverse();
        String secondHalf = sb.toString();

        outer: for (int i = 9; i >=0 ; i--) {
            while (frequency.get(i) == 1) {
                firstHalf += i;
                break outer;
            }
        }
        System.out.println(firstHalf+secondHalf);
    }

    private static boolean validate(List<Integer> frequency) {
        boolean countOdd = false;
        for (int i = 0; i < 10; i++) {
            if (frequency.get(i)%2==0) {
                continue;
            }else{
                if (countOdd)return false;
                countOdd=true;
            }
        }
        return true;
    }
}
