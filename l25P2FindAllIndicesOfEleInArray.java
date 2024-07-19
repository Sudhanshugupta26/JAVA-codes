package JavaCodingRestart;

import java.util.ArrayList;

public class l25P2FindAllIndicesOfEleInArray {
    static ArrayList<Integer> eleAtIndexArrayList(int arr[],int idx,int ele){
        ArrayList<Integer> arrlEle = new ArrayList<>();
        if(idx>arr.length-1)return new ArrayList<>();   // return empty arraylist.
        if(arr[idx]==ele)arrlEle.add(idx);
        ArrayList<Integer> ans = eleAtIndexArrayList(arr, idx+1, ele);
        ans.addAll(arrlEle);
        return ans;
    }

    static void eleAtIndex(int arr[],int idx,int ele){
        if(idx>arr.length-1)return;
        if(arr[idx]==ele)System.out.println("present at "+idx);
        eleAtIndex(arr, idx+1, ele);
    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,1,4,1,5};
        eleAtIndex(arr, 0, 1);
        System.out.println(eleAtIndexArrayList(arr, 0, 1));
    }
}
