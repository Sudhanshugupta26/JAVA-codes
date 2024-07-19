package JavaCodingRestart;

public class l11SumOfElementsInArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,9,5,6,77,8};
        int sum = 0;
        for (int i : arr1) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
