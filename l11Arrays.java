package JavaCodingRestart;

public class l11Arrays {
    public static void main(String[] args) {
        int array[]= new int[8];
        for(int i=0;i<8;i++){
            array[i]=i;
            System.out.println(array[i]);
        }
        int arr1[]={1,2,3,4,9,5,6,77,8};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println(array.length);
    }
}