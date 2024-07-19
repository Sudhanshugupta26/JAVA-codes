package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Collections;

public class l21P2CollectionsClassForP1 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);
        Collections.reverse(l1);
        System.out.println(l1);
    }
}
