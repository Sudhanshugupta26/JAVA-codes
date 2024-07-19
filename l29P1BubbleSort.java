package JavaCodingRestart;

public class l29P1BubbleSort {
    static void bubbleSort(int[] arr,int n,int idx){
        if(idx==arr.length-2 || n==1){
            if (arr[idx]>arr[idx+1]){
                int temp= arr[idx];
                arr[idx]=arr[idx+1];
                arr[idx+1]=temp;
                System.out.println("Restart1");
                return;
            }
            System.out.println("Restart2");
            return;
        }
        if (arr[idx]>arr[idx+1]){
            int temp= arr[idx];
            arr[idx]=arr[idx+1];
            arr[idx+1]=temp;
            bubbleSort(arr ,n-1, idx+1);
        }
        bubbleSort(arr, n-1, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,7,4,6,5};
        bubbleSort(arr,6 ,0);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
