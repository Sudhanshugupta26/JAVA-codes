package JavaCodingRestart;

public class l41StringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.setCharAt(0, 'M');
        System.out.println(str);
        str.append(" World");
        System.out.println(str);
        str.insert(2, 'y');
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        str.delete(5, 11);
        System.out.println(str);
    }
}
