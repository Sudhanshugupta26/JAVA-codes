package JavaCodingRestart;

public class l25P1FindingEleInArrayByRec {
    static int returnEleIndexInArray(int arr[],int idx,int ele){
        if(arr[idx]==ele )return idx;
        if ( idx==arr.length-1)return -1;
        return returnEleIndexInArray(arr, idx+1, ele);
    }

    static void findEleInArray(int arr[],int idx,int ele){
        if(arr[idx]==ele){
            System.out.println("YES");
            return;
        }
        if (idx==arr.length-1) {
            System.out.println("NO");
            return;
        }
        findEleInArray(arr, idx+1, ele);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9};
        findEleInArray(arr, 0, 1);
        System.out.println(returnEleIndexInArray(arr, 0, 9));
    }
}
