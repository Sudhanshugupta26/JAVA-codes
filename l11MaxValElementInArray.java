package JavaCodingRestart;

public class l11MaxValElementInArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,9,5,6,77,8};
        int max = 0;
        for (int i : arr1) {
            if (i>max) {
                max=i;
            }
        }
        System.out.println(max);
    }
}
