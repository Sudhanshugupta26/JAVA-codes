package JavaCodingRestart;

public class l18P4PascalTriangleByArrays {

    static int[][] PascalTriangle(int a){
        int [][]ans=new int[a+1][];
        for(int i = 0 ; i<=a;i++){
            ans[i]= new int[i+1];           // Defining 2nd dimension of Array.
            ans[i][0]=ans[i][i]=1;          // since every last and first elements of row is 1
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }

    static void Print2DArray(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a = 5;
        int[][] pascal=PascalTriangle(a);
        Print2DArray(pascal);
    }
}
