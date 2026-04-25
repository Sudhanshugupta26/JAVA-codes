package ExceptionHandling;

public class PrintingExceptionTypes {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.print("1. ");
            e.printStackTrace();
            System.out.print("2(a). ");
            System.out.println(e);
            System.out.print("2(b). ");
            System.out.println(e.toString());
            System.out.print("3. ");
            System.out.println(e.getMessage());
        }
    }
}