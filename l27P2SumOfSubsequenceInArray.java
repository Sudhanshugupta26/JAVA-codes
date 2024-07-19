package JavaCodingRestart;

public class l27P2SumOfSubsequenceInArray {
    static void sumOfSubsequence(int arr[], int curr, int idx,int sum){
        if(idx==arr.length){
            System.out.println(sum);
            return;
        }
        int a  = arr[idx];
        sumOfSubsequence(arr, curr, idx+1,sum+a);
        //curr[curr.length-1]=a;
        sumOfSubsequence(arr, curr, idx+1,sum);
        return;
    }

    public static void main(String[] args) {
        int[] a = {2,4,5};

        sumOfSubsequence(a, a.length, 0,0);
    }
}
