package JavaCodingRestart;

public class l11SearchElementInArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,9,5,6,77,8};
        int search =6;
        // Linear Search!
        for (int i =0;i<arr1.length;i++) {
            if (search == arr1[i]) {
                System.out.println("present at: "+(i+1));
                break;
            }
        }
    }
}