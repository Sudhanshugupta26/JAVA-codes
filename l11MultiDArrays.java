package JavaCodingRestart;

public class l11MultiDArrays {
    public static void main(String[] args) {
        int arr[][]=new int[5][5];  // 2D array
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=i+j;
            }
        }
        for(int i=0;i<arr.length;i++){      // LOGICAL
            for(int j=0;j<arr[i].length;j++){   //LOGICAL
                System.out.println(arr[i][j]);
            }
       }
       System.out.println(arr[0].length);
    }
}