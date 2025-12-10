package JavaCodingRestart;

public class l36P2 {
    static void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void arrange(int[] arr){
        int x=0,y=arr.length-1;
        while (x<y) {
            if (arr[x]>0 && arr[y]<0) {
                swap(arr, x, y);
                x++;
                y--;
            }
            if (arr[x]<0) {
                x++;
            }
            if (arr[y]>0) {
                y--;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={1,34,23,42,-123,1321,0,-3,-2,13,-12,-31,23,-1};
        arrange(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

