package JavaCodingRestart;

import java.util.Scanner;

public class l41StringToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i < str.length(); i++) {
            // a --> 97(ASCII) & A --> 65(ASCII)
            boolean flag = true; // Capital
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            int asc = (int)ch;
            if(asc>=97) flag=false; //small
            if (flag) {         //capital
                asc+=32;
                char alp = (char)asc;
                str.setCharAt(i, alp);
            }
            else{   // small
                asc-=32;
                char alp = (char)asc;
                str.setCharAt(i, alp);
            }
        }
        System.out.println(str);
        sc.close();
    }
}
