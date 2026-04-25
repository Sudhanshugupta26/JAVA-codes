package ExceptionHandling;

class YoungerAgeException extends RuntimeException {
    YoungerAgeException(String s) {
        super(s); // This will provide parameter to parent class(RuntimeException).
    }
}

public class ThrowCustom {
    public static void main(String[] args) {
        int age = 16;
        if (age < 18) {
            throw new YoungerAgeException("Not Eligible for vote because age less than 18"); // The error msg is printed
                                                                                             // by Default exception
                                                                                             // handler.
        } else {
            System.out.println("Go for vote!!");
        }
    }
}
