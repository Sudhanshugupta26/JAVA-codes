package JavaCodingRestart;

import java.util.Arrays;

public class l12DeepCopy {
    static void arrayPrint(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,9,5,6,77,8};
        int arr2[] = arr1.clone();  // Copying of elements in arr1 from heap memory and assigning different address of arr2 in stack memory.
        arrayPrint(arr1);
        arrayPrint(arr2);
        arr2[0]=100;                // Changes happens in arr2 only due to Deep copy.
        arrayPrint(arr2);
        arrayPrint(arr1);
        int arr3[]= Arrays.copyOf(arr1, arr1.length); //(array which has to make copy , number of elements of array which we want to make copy)
        arr3[0]=101;                // Changes happens in arr3 only due to Deep copy.
        arrayPrint(arr3);
        arrayPrint(arr1);
        int arr4[]= Arrays.copyOfRange(arr1,0,arr1.length); // (array,start index,end index -1)
        arr4[0]=102;                // Changes happens in arr3 only due to Deep copy.
        arrayPrint(arr4);
        arrayPrint(arr1);
    }
}