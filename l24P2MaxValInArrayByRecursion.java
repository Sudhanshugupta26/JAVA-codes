package JavaCodingRestart;

public class l24P2MaxValInArrayByRecursion {
    static int maxValInArray(int[] arr,int indx){
        if(indx==arr.length-1)return arr[indx];
        int ans = maxValInArray(arr, indx+1);
        // Math.max find gretest number.
        return Math.max(arr[indx], ans);    // compare arr[indx] & ans.
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8};
        System.out.println(maxValInArray(array, 0));
}
}