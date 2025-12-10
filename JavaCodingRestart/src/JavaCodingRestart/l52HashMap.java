package JavaCodingRestart;

import java.util.HashMap;
import java.util.Map;

public class l52HashMap {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Sudhanshu", 26); // Add key-value to map
        mp.put("Tushar", 21);
        System.out.println(mp.get("Sudhanshu")); //26
        System.out.println(mp.get("Raghav")); //null
        mp.put("Sudhanshu", 02); // can not contain duplicate so it updates the value in specified key if it exist
        System.out.println(mp.get("Sudhanshu"));
        System.out.println(mp.remove("Tushar")); // 21, Removes element. 
        System.out.println(mp.remove("Akshay")); // null
        System.out.println(mp.containsKey("Sudhanshu"));// true
        System.out.println(mp.containsKey("Tushar"));// false
        mp.putIfAbsent("Tushar", 21); // put if absent otherwise no change.
        System.out.println(mp.keySet()); // all keys present
        System.out.println(mp.values()); // all values present
        System.out.println(mp.entrySet()); // all the things 
        for (String key : mp.keySet()) { // traversing through key
            System.out.println(key+" "+mp.get(key));
        }
        System.out.println();
        for (Map.Entry<String,Integer> ele : mp.entrySet()) { // tarversing through each pair
            System.out.println(ele.getKey()+" "+ele.getValue());
        }
        
    }
}
