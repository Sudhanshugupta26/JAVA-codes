package JavaCodingRestart;

import java.util.Scanner;

public class l6P4SumOfSeries1 {
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int i=1;
            int sum = 0;
            while(a>=i){
                if(i%2==0){
                    sum-=i;
                    i++;
                    continue;
                }
                sum+=i;
                i++;
            }
            System.out.println(sum);
        }
    }
}
