package JavaCodingRestart;

public class l13P3FindElementWhichOccursOnlyOnce {
    static void OnlyOnce(int arr[]){
        for(int i=0;i<arr.length;i++){
            int mark = arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==mark){
                    count++;
                }
            }
            if(count==1){
                System.out.println("Element "+mark+" occured only once at index "+i);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        OnlyOnce(arr);
    }
}
