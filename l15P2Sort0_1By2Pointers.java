package JavaCodingRestart;

public class l15P2Sort0_1By2Pointers {
    static void sort0$1By2Pointer(int[] arr){
        int beg=0;
        int end=arr.length-1;
        while(beg<end){
            if(arr[beg]==1 && arr[end]==0){
                arr[beg]=0;
                arr[end]=1;
                beg++;
                end--;
            }
            else if (arr[beg]==0) {
                beg++;
            }
            else{
                end--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,0,1,1,1,0,1,0};
        sort0$1By2Pointer(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
