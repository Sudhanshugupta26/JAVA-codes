package JavaCodingRestart;

public class l14P3ReversingArray2 {     // Manipulation in given array.
    static void Reverse(int[] arr){
        int n = arr.length-1;
        for(int i = 0; i<((arr.length))/2;i++){
            arr[i]+=arr[n-i];
            arr[n-i]=arr[i]-arr[n-i];
            arr[i]-=arr[n-i];
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        Reverse(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
