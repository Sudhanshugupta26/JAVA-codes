package JavaCodingRestart;

public class l40Racing {
    static boolean compare(int[] arr, int m, int min){
        int kids = 1;
        int lastKid = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-lastKid >= min){
                lastKid=arr[i];
                kids++;
            }
        }
        return (kids>=m); 
    }
    static int race(int[] arr,int m){
        if (m>arr.length) {
            return -1;
        }
        int st=1, end=(int) 1e9, ans=0;
        while (st<=end) {
            int mid= (st+end)/2;
            if (compare(arr, m, mid)) {
                ans=mid;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,8,9};
        System.out.println(race(arr,3));
    }
}
