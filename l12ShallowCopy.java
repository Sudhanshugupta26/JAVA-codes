package JavaCodingRestart;

public class l12ShallowCopy {
    static void arrayPrint(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    static void arrayChange(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=7;
        }
        //System.out.println();
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,9,5,6,77,8};
        int arr2[] = arr1;  // Copying memory address of arr1. We are just giving the memory address to arr2 of arr1.
        arrayPrint(arr1);
        arrayPrint(arr2);
        arr2[0]=100;        // Changes happens in both arrays due to shallow copy.
        arrayPrint(arr2);
        arrayPrint(arr1);
        arrayChange(arr2);  // Changes happens by Functions also reflected on both.
        arrayPrint(arr2);
        arrayPrint(arr1);
    }
}