package L10Package;

public class OutsideApp {
    public static void main(String[] args) {
        int arr[]=new int[10];
        System.out.println(arr.length);
        App A = new App();
        A.greet(); // since they are in same package.s
    }
}
