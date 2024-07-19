package JavaCodingRestart;

import java.util.ArrayList;

public class l21P1ReverseArrayList {
    static void reverseArrayList(ArrayList<Integer> list){
        int mid = list.size()/2;
        int length = list.size()-1;
        for (int i = 0; i < mid; i++) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(length-i));
            list.set(length-i, temp);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);
        reverseArrayList(l1);
        System.out.println(l1);
    }
}
