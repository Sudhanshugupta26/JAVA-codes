package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Collections;

public class l35BucketSort {

    static void BucketSort(float[] arr){
        int n = arr.length;
        // creating buckets
        ArrayList<Float>[] buckets = new ArrayList[n]; // creating array of arraylists since we don't know the number of elements.
        // creeating empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();  // created each element of bucket as arraylist.
        }
        // adding elements into it
        for (int i = 0; i < n; i++) {
            int idx = (int) arr[i]*10;
            buckets[idx].add(arr[i]);
        }
        // sorting each bucket
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }
        
        //Merge all bucket to obtain final array
        int index=0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currbucket = buckets[i];
            for (int j = 0; j < currbucket.size(); j++) {
                arr[index++]=currbucket.get(j);
            }
        }
    
    }
    public static void main(String[] args) {
        float[] arr = {0.5f,0.2f,0.4f,0.9f,0.7f};
        BucketSort(arr);
        for (float f : arr) {
            System.out.print(f+" ");
        }
    }

}
