package JavaCodingRestart;

public class l35RadixSort {
    static void display(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
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
    static void stableCountSort(int[] arr, int place){
        int n = arr.length;
        int[] count = new int[10];      // since digits are 0-9
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            int digi = (arr[i]/place)%10;
            count[digi]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i]+=count[i-1];   // creating prefix sum array.
        }
        for (int i = arr.length-1; i>=0; i--) { //sorting happens
            int digi = (arr[i]/place)%10;
            int idx = count[digi]-1;
            output[idx] = arr[i];
            count[digi]--;
        }
        for (int i = 0; i < n; i++) {
            arr[i]=output[i];
        }
        return;
    }
    static void RadixSort(int[] arr){
        int max = findMax(arr);
        for (int place=1; max/place > 0 ; place*=10) {
            stableCountSort(arr,place);
        }
        display(arr);
        return;
    }
    public static void main(String[] args) {
        int[] arr={12,324,23,52,43,24,325,324};
        RadixSort(arr);
    }
}
