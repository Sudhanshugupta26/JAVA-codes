package JavaCodingRestart;

public class l24P1PrintArrayByRecursion {
    static void printArrayByRec(int[] arr, int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArrayByRec(arr, index+1);
        return;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8};
        printArrayByRec(array, 0);
    }
}
