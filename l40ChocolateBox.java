package JavaCodingRestart;

public class l40ChocolateBox {
    static boolean isDivPossible(int[] arr, int m, int max){
        int numStud = 1;
        int choco = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                return false;
            }
            if (choco+arr[i] <= max) {
                choco+=arr[i];
            }
            else{
                numStud++;
                choco=arr[i];
            }
        }
        return (numStud <= m);
    }
    static int chocolate(int[] arr, int m){
        if (arr.length < m) return -1;
        int st=1, end=(int)1e9, ans=0;
        while (st<=end) {
            int mid = (int) (st+end)/2;
            System.out.println(st+" "+end+" "+mid);
            if (isDivPossible(arr,m,mid)) {
                ans=mid;
                end=mid-1;   
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {12,34,67,90};
        System.out.println(chocolate(arr, 2));
    }
}
