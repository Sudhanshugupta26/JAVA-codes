package L10Package;

class InnerApp {
    int arr[];

    public InnerApp() {
        this.arr = new int[10];
    }

    public int[] Insert() {
        return arr;
    }

}

public class App {
    void greet() {
        System.out.println("Namaste!");
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println(arr[1]);
    }
}
