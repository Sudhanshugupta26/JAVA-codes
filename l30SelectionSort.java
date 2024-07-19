package JavaCodingRestart;

public class l30SelectionSort {
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int count = i;
            for (int j = i; j < arr.length-1; j++) {
                if(arr[count]>arr[j]){
                    count = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[count];
            arr[count]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5,7,9,8,2};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
