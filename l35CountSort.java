package JavaCodingRestart;

public class l35CountSort {
    static void display(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
    static void CountSort(int[] arr){
        int[] count = new int[findMax(arr)+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k=0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++]=i;
            }
        }
    }

    static void stableCountSort(int[] arr){
        int[] count = new int[findMax(arr)+1];
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i]+=count[i-1];   // creating prefix sum array.
        }
        for (int i = arr.length-1; i>=0; i--) {
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        display(output);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,2,5};
        CountSort(arr);
        display(arr);
        System.out.println();
        stableCountSort(arr);
    }
}
