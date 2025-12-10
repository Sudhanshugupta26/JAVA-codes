package JavaCodingRestart;

import java.util.HashMap;

public class l53Anagram {
    static HashMap<Character,Integer> makeMap(String s){
        HashMap<Character,Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (mp.containsKey(a)) {
                mp.put(a, mp.get(a)+1);
            }else{
                mp.put(a, 1);
            }
        }
        return mp;
    }
    static boolean isAnagram(String s1, String s2){
        if (s1.length()!=s2.length()) return false;
        HashMap<Character, Integer> mp = makeMap(s1);
        for (int i = 0; i < s2.length(); i++) {
            char a = s2.charAt(i);
            if (mp.containsKey(a)) {
                mp.put(a, mp.get(a)-1);
                if (mp.get(a)<0) {
                    return false;
                }
            }else{
                return false;
            }
        }
        for (var a : mp.values()) {
            if (a!=0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "aacc";
        String b = "ccac";
        System.out.println(isAnagram(a, b));
    }
}
