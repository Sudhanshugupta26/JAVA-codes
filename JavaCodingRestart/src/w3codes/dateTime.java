package w3codes;

import java.time.*;
import java.time.format.DateTimeFormatter;;

public class dateTime {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy HH:mm:ss");
        System.out.println(d);
        System.out.println(f);
    }
}
