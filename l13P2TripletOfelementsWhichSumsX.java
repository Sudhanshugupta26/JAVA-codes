package JavaCodingRestart;

public class l13P2TripletOfelementsWhichSumsX {
    static int triplets(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[]={4,6,3,5,8,2};
        int triplets = triplets(arr, 12);
        System.out.println(triplets);
    }  
}
