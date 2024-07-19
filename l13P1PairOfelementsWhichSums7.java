package JavaCodingRestart;

public class l13P1PairOfelementsWhichSums7 {
    static int pair(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={4,6,3,5,8,2};
        int pairs = pair(arr, 7);
        System.out.println(pairs);
    }    
}
