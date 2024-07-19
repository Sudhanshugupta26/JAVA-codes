package JavaCodingRestart;

public class l31InsertionSort {
    static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            int j = i;
            while (j>0 && arr[j]<arr[j-1]) {
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,6,5,4,7,8};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}