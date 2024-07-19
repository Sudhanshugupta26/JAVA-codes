package JavaCodingRestart;

public class l15P4SquareElementsOfArrayBy2Pointers {
    static int[] arraySquare(int[] arr){
        int n =arr.length;
        int[] ans=new int[n];
        int beg = 0, end = n-1;
        int k = n-1;
        while (beg<=end) {
            if (Math.abs(arr[beg])>Math.abs(arr[end])) {
                ans[k--]=arr[beg]*arr[beg];
                beg++;
            }
            else{
                ans[k--]=arr[end]*arr[end];
                end--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-10,-3,-2,1,4,6,8};      // Sorted array.
        int ans[]=arraySquare(arr);
        for (int i : ans) {
            System.out.print(i+" ");
        }System.out.println();
    }
}
