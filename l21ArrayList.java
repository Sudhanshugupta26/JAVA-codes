package JavaCodingRestart;
import java.util.ArrayList;

public class l21ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 =new ArrayList<>();   // Arraylist created.
       
        // add element
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
       
        // get element at ith index.
        System.out.println(l1.get(0));
       
        // print with loop.
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
        for (Integer integer : l1) {
            System.out.println(integer);
        }
       
        // print ArrayList Directly
        System.out.println(l1); // [1,2,3,4]
       
        // adding element at some index i
        l1.add(1,100);  //[1,100,2,3,4]
        System.out.println(l1);

        // modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);

        // removing ele by index
        l1.remove(1);
        System.out.println(l1);

        // removing an ele by value
        l1.remove(Integer.valueOf(1));
        System.out.println(l1);
        l1.remove(Integer.valueOf(1843875));    // Doesn't give error.
        System.out.println(l1.remove(Integer.valueOf(1843875)));    // gives false b/c not present.
        
        // checking element exist or not
        boolean ans = l1.contains(Integer.valueOf(4));
        System.out.println(ans);

        // If you don't specify Wrapper class, you can put anything in it
        ArrayList l2 = new ArrayList();
        l2.add("sudhanshu");
        l2.add(26);
        l2.add(5.11f);
        System.out.println(l2);
    }
}
