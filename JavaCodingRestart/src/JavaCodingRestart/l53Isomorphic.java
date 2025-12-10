package JavaCodingRestart;

import java.util.HashMap;

public class l53Isomorphic {
    public static boolean isIsomorphic(String s, String t){
        if (s.length()!=t.length()) return false;
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if (map.containsKey(a)) {
                if (map.get(a)==b) {
                    continue;
                }
                return false;
            }else if (map.containsValue(b)) {
                return false;
            }else{
                map.put(a, b);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("akd", "egh"));
    }
}
