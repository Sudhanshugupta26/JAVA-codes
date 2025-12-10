package JavaCodingRestart;

public class l36P1 {
    static void sort(int []arr){
        int x=-1,y=-1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>arr[i]) {
                if (x==-1) {    // 1st conflict
                    x=i-1;
                    y=i;
                } else {    // 2nd conflict
                    y=i;
                }
            }
        }
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,6,7,5,9};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
