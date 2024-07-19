package JavaCodingRestart;
class Student{      // class Studnet is created.
    int age ;
    String name;
}
public class l9ObjectCreation {   // Public class should be as named as file name.
    public static void main(String[] args) {
        Student rohan = new Student();     // object rohan created for class Student.
        rohan.age=20;
        rohan.name="Rohan";
        System.out.println(rohan.age+" "+rohan.name);
        Student amit = new Student();       // object amit created for class Student.
        amit.age=21;
        amit.name="Amit";
        System.out.println(amit.age+" "+amit.name);
    }
}
