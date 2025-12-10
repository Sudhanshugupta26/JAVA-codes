package JavaCodingRestart;

import java.util.HashMap;
import java.util.Map;

public class l52Times {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,4,1,2,2,2,3,3,3,4,3};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map.entrySet());
        int max=0;
        int key=0;
        for (int i : map.keySet()) {
            if((int)map.get(i) > max){
                key=i;
                max=map.get(key);
            }
        }
        System.out.println(key);
    }
}
