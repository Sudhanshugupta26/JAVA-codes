package JavaCodingRestart;

public class l28P1FrogJumpQInLec36 {
    static int minJumpCost(int[] arr,int idx){
        if(idx==(arr.length-1)){
            return 0;
        }
        int sum1 = (int)Math.abs(arr[idx]-arr[idx+1])+minJumpCost(arr, idx+1);
        if(idx==(arr.length-2)){
            return sum1;
        }
        int sum2 = (int)Math.abs(arr[idx]-arr[idx+2])+minJumpCost(arr, idx+2);
        return Math.min(sum1, sum2);

    }

    public static void main(String[] args) {
        int arr[] = {10,30,40,20};
        System.out.println(arr.length-1);
        System.out.println(arr.length-2);
        System.out.println(minJumpCost(arr, 0));
    }
}
