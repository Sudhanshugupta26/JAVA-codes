package JavaCodingRestart;

public class l33MergeSort {
    static void merge(int[] arr,int a,int mid,int l){
        int n1 = mid-a+1;
        int n2 = l-mid;
        int[] left= new int[n1];
        int[] right = new int[n2];
        int i,j,k=a;
        for (i = 0; i < left.length; i++)left[i]=arr[a+i];
        for (j = 0; j < right.length; j++)right[j]=arr[mid+1+j];
        i=0;
        j=0;
        while (i<n1 && j<n2) {
            if (left[i]<=right[j]) {
                arr[k++]=left[i++];
            }
            else{
                arr[k++]=right[j++];
            }
        }
        while (i<n1) {
            arr[k++]=left[i++];
        }
        while (j<n2) {
            arr[k++]=right[j++];
        }

    }
    static void mergeSort(int arr[],int a,int l){
        if(a>=l)return;
        int mid = (a+l)/2;
        mergeSort(arr, a, mid);
        mergeSort(arr, mid+1, l);
        merge(arr,a,mid,l);
        return;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,7,22,77,33,1,88};
        mergeSort(arr,0,arr.length-1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
