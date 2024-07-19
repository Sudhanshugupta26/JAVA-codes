package JavaCodingRestart;

public class l14P5CheckingQNumbersPresentInArray {

    static void checkingQNumbersInArray(int[]arr , int[] q){
        for (int i : q) {
            for (int j : arr) {
                if(i==j){
                    System.out.println( i +" is present in given Array.");
                    break;                                                // It indicates the recent loop terminate 1st.
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {12,3,224,5,54,6667,4,67,34354,324657,67,885,7887,785};
        int q[] = {224,34354,345678};
        checkingQNumbersInArray(arr, q);

    }
}