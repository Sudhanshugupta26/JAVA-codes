package JavaCodingRestart;

public class l16P3EqualSumPartition {
    static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    static Boolean EqualSumPartition(int[] arr){
        int sum = sumOfArray(arr);
        int pref = 0;
        for(int i=0;i<arr.length;i++){
            pref+=arr[i];
            int suff=sum-pref;
            if(pref==suff)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,6,3,1};
        int arr1[]={1,3,2,4,5};
        System.out.println(EqualSumPartition(arr));
        System.out.println(EqualSumPartition(arr1));
    }
}
