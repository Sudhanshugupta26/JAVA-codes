package JavaCodingRestart;

import java.util.Comparator;
import java.util.PriorityQueue;

public class l64PriorityQueueAsHeap {

    static class Student{
        String name;
        int marks;
        int roll;
    }

    static class StudentComparator implements Comparator<Student>{  //To implement comparator on custom classes.
        //Overriding compare method.
        public int compare(Student s1, Student s2){
            if(s1.marks>s2.marks){
                return -1;   //This will make it max heap.
            }else if(s1.marks<s2.marks){
                return 1;   //This will make it max heap.
            }else{
                if(s1.roll>s2.roll){
                    return 1; //This will make it min heap.
                }else if(s1.roll<s2.roll) {
                    return -1;  //This will make it min heap.
                }else{
                    return 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //By default min heap.
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); //For max heap.
        PriorityQueue<Student> students = new PriorityQueue<>(new StudentComparator());
        Student s1 = new Student();
        s1.name="Sudhanshu";
        s1.roll=1220440038;
        s1.marks=90;
        Student s2 = new Student();
        s2.name="Tushar";
        s2.roll=1220440039;
        s2.marks=90;
        students.add(s1);
        students.add(s2);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(students.peek().name);
    }
}
