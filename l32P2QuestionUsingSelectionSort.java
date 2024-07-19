package JavaCodingRestart;

public class l32P2QuestionUsingSelectionSort {
    public static void main(String[] args) {
        String[] arr = {"apple","watermelon","chiku","banana","carrot"};

        for (int i = 0; i < arr.length; i++) {
            int count  = i;
            for (int j = i; j < arr.length-1;j++) {
                if(arr[count].compareTo(arr[j+1])>0){
                    count = j+1;
                }
            }
            String temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
        }

        for (String string : arr) {
            System.out.println(string);
        }
    }
}
