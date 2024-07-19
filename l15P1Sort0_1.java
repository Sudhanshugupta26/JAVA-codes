package JavaCodingRestart;

public class l15P1Sort0_1 {
    static void sort0$1(int[] arr){
        int zero = count(arr, 0);
        for(int i = 0;i<arr.length;i++){
            if(i<zero) arr[i]=0;
            else arr[i]=1;
        }
    }
    static int count(int[] arr,int x){
        int count = 0;
        for (int i : arr) {
            if (x==i) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,0,0,1,1,1,0};
        sort0$1(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
