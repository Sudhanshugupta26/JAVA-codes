package JavaCodingRestart;

public class l15P3SortByEvenOdd {
    static void sortEvenOddBy2Pointer(int[] arr){
        int beg=0;
        int end=arr.length-1;
        while(beg<end){
            if(arr[beg]%2!=0 && arr[end]%2==0){
                arr[beg]+=arr[end];
                arr[end]=arr[beg]-arr[end];
                arr[beg]-=arr[end];
                beg++;
                end--;
            }
            else if (arr[beg]%2==0) {
                beg++;
            }
            else{
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,44,55,66,22,99,191};
        sortEvenOddBy2Pointer(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }System.out.println();
    }
}
