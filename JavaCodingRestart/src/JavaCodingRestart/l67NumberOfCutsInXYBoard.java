package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class l67NumberOfCutsInXYBoard {
    public static void main(String[] args) {
        int M = 6 , N = 4;
        List<Integer> X = new ArrayList<>(); // Cost of cutting in X
        List<Integer> Y = new ArrayList<>();   // Cost of cutting in Y
        X.add(2);X.add(1);X.add(3);X.add(1);X.add(4);
        Y.add(4);Y.add(1);Y.add(2);

        Collections.sort(X, Collections.reverseOrder());
        Collections.sort(Y, Collections.reverseOrder());

        int horizontalPieces = 1;
        int verticalPieces = 1;

        // The approach is greedy, because we are going to cut the costliest cut first across each axis to minimize cost.
        int i=0,j=0;
        int result = 0;

        while (i<M-1 && j<N-1){
            if (X.get(i)>Y.get(j)){
                result += X.get(i)*horizontalPieces;
                verticalPieces++;
                i++;
            }
            else{
                result += Y.get(j)*verticalPieces;
                horizontalPieces++;
                j++;
            }
        }

        while(i<M-1){
            result += X.get(i)*horizontalPieces;
            i++;
        }

        while(j<N-1){
            result += Y.get(j)*verticalPieces;
            j++;
        }

        System.out.println(result);
    }
}
