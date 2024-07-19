package JavaCodingRestart;

public class l24P3SumOfElementsInArray {
    static int sumOfArray(int[] arr,int idx){
        if(idx==arr.length-1)return arr[idx];
        return arr[idx] + sumOfArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8};
        System.out.println(sumOfArray(array, 0));
    }
}
