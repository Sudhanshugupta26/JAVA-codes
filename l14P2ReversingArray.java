package JavaCodingRestart;

public class l14P2ReversingArray {
    static int[] reverse(int arr[]){
        int rarr[] = new int[arr.length];
        int j = 0;
        for(int i=arr.length-1;i>-1;i--){
            rarr[j++]=arr[i];       // rarr[j] = arr[i] ; j++;
        }
        return rarr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,10,5,6,7,8,9,11};
        int rarr[]=reverse(arr);
        for (int i : rarr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
