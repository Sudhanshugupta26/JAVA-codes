package JavaCodingRestart;

public class l12NumberOfOccurenceInArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,9,5,6,77,8,6};
        int search =6;
        int count = 0;
        for (int i =0;i<arr1.length;i++) {
            if (search == arr1[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}