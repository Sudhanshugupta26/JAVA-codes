package JavaCodingRestart;

public class l14P4RotatingArray {
    static int[] rotate(int[] arr, int k){
        k=k%arr.length;
        int i = 0, n = arr.length-1;
        while (i<k) {
            int last=arr[n];
            for(int j = n ; j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
            i++;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int roarr[]=rotate(arr, 123);
        for (int i : roarr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}