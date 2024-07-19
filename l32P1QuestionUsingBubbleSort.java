package JavaCodingRestart;

public class l32P1QuestionUsingBubbleSort {
    public static void main(String[] args) {
        int[] arr= {0,2,4,0,7,6,3,1};

        outer:for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]==0) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = true;
                }
            }
            if (!flag) {
                break outer;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }   
}
