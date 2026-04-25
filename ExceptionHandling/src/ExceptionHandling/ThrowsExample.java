package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadAndWrite {
    void readFile() throws FileNotFoundException { // It basically tells the calling function that this error can be
                                                   // occured
        FileInputStream fs = new FileInputStream("d:/abc.txt");
    }

    void saveFile() throws FileNotFoundException {
        FileOutputStream fo = new FileOutputStream("d:/xyz");
    }
}

public class ThrowsExample {
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try {
            rw.readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            rw.saveFile();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Hello");
    }
}
