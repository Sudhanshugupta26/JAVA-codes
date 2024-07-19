package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Collections;

public class l21P3SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1432);
        l1.add(20);
        l1.add(323);
        l1.add(4);
        System.out.println(l1);
        Collections.sort(l1);   // Can also Sort ArrayList of Any DataType.
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
        
}
}