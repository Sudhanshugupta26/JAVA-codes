package JavaCodingRestart;

import java.util.HashSet;

public class l54HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(9);
        System.out.println(hs.contains(10));
        for (Integer integer : hs) {
            System.out.println(integer);
        }
        System.out.println(hs.size());
        hs.remove(9);
        for (Integer integer : hs) {
            System.out.println(integer);
        }
    }
}
