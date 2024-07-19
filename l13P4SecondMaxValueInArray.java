package JavaCodingRestart;

public class l13P4SecondMaxValueInArray {
    static int SecondMax(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length;i++){
            if(max<arr[i])max=arr[i];
        }
        int smax =Integer.MIN_VALUE;
        for(int j=0 ; j<arr.length;j++){
            if(smax<arr[j] && arr[j]<max)smax=arr[j];
        }
        return smax;
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4,-5,-6,-7,-6,-5,-4,-3,-2,-1};
        int smax = SecondMax(arr);
        System.out.println(smax);
    }
}
