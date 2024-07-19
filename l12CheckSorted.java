package JavaCodingRestart;

public class l12CheckSorted {
    static void checkSortAcending(int arr[]){
        for (int i =1;i<arr.length-1;i++) {
            if (arr[i] > arr[i+1]) {
                System.out.println("Not Sorted!");
                return;
            }
        }
        System.out.println("Sorted!");
    }
    static void checkSortDecending(int arr[]){
        for (int i =0;i<arr.length-1;i++) {
            if (arr[i] < arr[i+1]) {
                System.out.println("Not Sorted!");
                return;
            }
        }
        System.out.println("Sorted!");
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8};
        checkSortAcending(arr1);
        int arr2[]={8,7,6,5,4,3,2,1};
        checkSortDecending(arr2);
    }
}
