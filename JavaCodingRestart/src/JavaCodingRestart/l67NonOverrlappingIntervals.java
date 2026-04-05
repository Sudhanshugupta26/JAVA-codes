package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class l67NonOverrlappingIntervals {
    static class Interval{
        int start;
        int end;
        public Interval(int start,int end){
            this.start = start;
            this.end = end;
        }

        public String toString(){
            return "["+start+","+end+"]";
        }
    }

    public static class IntervalComparator implements Comparator<Interval>{
        public int compare(Interval i1,Interval i2){
            if(i1.start<i2.start) return -1;
            else if(i1.start>i2.start) return 1;
            else return 0;
        }
    }
    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,2));
        intervals.add(new Interval(2,3));
        intervals.add(new Interval(3,4));
        intervals.add(new Interval(1,3));

        intervals.sort(new IntervalComparator());

        System.out.println(intervals);

        int result = 0;
        int prevEnd = intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            if(prevEnd>intervals.get(i).start){
                prevEnd = Math.min(intervals.get(i).end,prevEnd);   // This is the line which basically remove the interval from consideration rather than array.
                result++;
            }else{
                prevEnd = intervals.get(i).end;
            }
        }
        System.out.println(result);
    }
}
