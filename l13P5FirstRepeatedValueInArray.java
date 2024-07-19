package JavaCodingRestart;

public class l13P5FirstRepeatedValueInArray {
    static void firstRepeated(int arr[]){
        for(int i = 0 ;i<arr.length;i++){
            int ele = arr[i];
            for(int j = i+1;j<arr.length;j++){
                if(ele==arr[j]){
                    System.out.println("Element "+ele+" repeated first.");
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        firstRepeated(arr);
    }
}
