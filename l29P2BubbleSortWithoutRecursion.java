package JavaCodingRestart;

public class l29P2BubbleSortWithoutRecursion {
    static void bubbleSortWR(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag = false; 
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2,1};
        bubbleSortWR(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
