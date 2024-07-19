package JavaCodingRestart;

public class l5LoopLable {          // this code makes no sense but we can understand the concept by it.
    public static void main(String[] args) {
        int a=10;
        outer: for(int i =0 ; i<a;i++){
           inner: for(int j =0 ;j<i;j++){
                if(a<i){
                    break outer;}
                continue inner;
            }
        }
    }
}
