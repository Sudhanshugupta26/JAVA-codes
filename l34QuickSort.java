package JavaCodingRestart;

public class l34QuickSort {
    static int partition(int[] arr,int start,int end){
        int piv =(int) Math.random()*(end-start+1) + start ;
        int count=0;
        for (int i = start; i <= end; i++) {
            if (arr[piv]>arr[i]) {
                count++;
            }
        }
        int temp = arr[start+count];
        arr[start+count]=arr[piv];
        arr[piv]=temp;
        piv = start+count;
        int beg=start,last=end;
        while (beg<piv && last>piv) {
            if(arr[beg]>arr[piv]){
                if(arr[end]<arr[piv]){
                    int swap = arr[beg];
                    arr[beg]=arr[end];
                    arr[end]=swap;
                    beg++;
                    end--;
                }
                else end--;
            }
            else beg++;
        }
        while (beg<piv) {
            beg++;
        }
        while (end>piv) {
            end--;
        }
        return piv;
    }

    static void QuickSort(int[] arr,int start,int end){
        if (end<=start) {
            return;
        }
        int piv = partition(arr,start,end);
        QuickSort(arr, start, piv-1);
        QuickSort(arr, piv+1, end);
        return;
    }


    public static void main(String[] args) {
        int[] arr={4,9,2,5,10,12,1,3};
        QuickSort(arr, 0, arr.length-1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
