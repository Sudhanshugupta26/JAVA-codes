package JavaCodingRestart;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class l64P2 {
    // Question: Find the k closest points to the origin in XY plane using manhattan distance.
    public static class Point {
        int x;
        int y;
        float distance;
        Point(int x, int y){
            this.x = x;
            this.y = y;
            this.distance =(float) Math.sqrt(Math.pow(x,2)+Math.pow(y,2));  // Manhattan Distance.
        }
    }

    private static class PointComparator implements Comparator<Point> {
        public int compare(Point p1, Point p2) {
            if(p1.distance < p1.distance) return -1;    // Creating it a Max Heap.
            else if(p1.distance > p1.distance) return 1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Point> pq = new PriorityQueue<>(new PointComparator());
        List<Point> l = new ArrayList<>();
        int k = 3;
        Point p1 = new Point(5,3);
        Point p2 = new Point(1,2);
        Point p3 = new Point(3,4);
        Point p4 = new Point(5,6);
        Point p5 = new Point(7,8);
        Point p6 = new Point(9,10);
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);
        l.add(p6);
        for(Point p:l){
            if(pq.size() == k){
                if (pq.peek().distance>p.distance){
                    pq.poll();
                    pq.add(p);
                }
                continue;
            }
            pq.add(p);
        }
        for (Point point : pq) {
            System.out.println(point.x+" "+point.y+" "+point.distance);
        }
    }
}
