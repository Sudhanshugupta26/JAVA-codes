package JavaCodingRestart;

public class l37P2 {
    static int BinarySearch(int num){
        int res = -1;
        int beg = 0;
        int end = num;
        while (beg<=end) {
            int mid = (int)(beg+end)/2;
            int val = mid*mid;
            if (val==num) {
                res = mid;
                return res;
            }
            else if (num<val) {
                end = mid-1;
            }
            else{
                res = mid;
                beg = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        // nearest floor integer square root of a number
        System.out.println(BinarySearch(101));
    }
}
