package JavaCodingRestart;
import java.util.HashMap;

public class InterviewEpam {

    // 1. The Data Set Format
    static class Packet {
        String pNo; // Unique Identifier
        String sender;
        String receiver;
        String destination;

        Packet(String pNo, String sender, String receiver, String destination) {
            this.pNo = pNo;
            this.sender = sender;
            this.receiver = receiver;
            this.destination = destination;
        }

        @Override
        public String toString() {
            return "[" + pNo + " | " + sender + " -> " + destination + "]";
        }
    }

    static class FastPacketDeque {
        // Node stores the Packet object and pointers
        class Node {
            Packet data;
            Node prev, next;
            Node(Packet data) { this.data = data; }
        }

        private Node head, tail;
        private HashMap<String, Node> map; // Key: P.no, Value: Node

        public FastPacketDeque() {
            map = new HashMap<>();
            head = new Node(null);
            tail = new Node(null);
            head.next = tail;
            tail.prev = head;
        }

        // O(1) Lookup by P.no
        public Packet lookup(String pNo) {
            Node node = map.get(pNo);
            return (node != null) ? node.data : null;
        }

        // O(1) Insert Front
        public void insertFront(Packet p) {
            if (map.containsKey(p.pNo)) return;
            Node newNode = new Node(p);
            map.put(p.pNo, newNode);

            newNode.next = head.next;
            newNode.prev = head;
            head.next.prev = newNode;
            head.next = newNode;
        }

        // O(1) Insert Last
        public void insertLast(Packet p) {
            if (map.containsKey(p.pNo)) return;
            Node newNode = new Node(p);
            map.put(p.pNo, newNode);

            newNode.prev = tail.prev;
            newNode.next = tail;
            tail.prev.next = newNode;
            tail.prev = newNode;
        }

        // O(1) Remove Any by P.no
        public void remove(String pNo) {
            Node node = map.get(pNo);
            if (node == null) return;

            node.prev.next = node.next;
            node.next.prev = node.prev;
            map.remove(pNo);
        }

        public void display() {
            Node temp = head.next;
            while (temp != tail) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("End");
        }

        public static void main(String[] args) {
            FastPacketDeque list = new FastPacketDeque();

            // Adding Data Sets
            list.insertLast(new Packet("101", "Alice", "Bob", "NY"));
            list.insertFront(new Packet("102", "Charlie", "Dave", "LA"));
            list.insertLast(new Packet("103", "Eve", "Frank", "SF"));

            // O(1) Operations
            System.out.println("Lookup 102: " + list.lookup("102"));

            list.remove("101"); // Removes "101" from the middle instantly

            list.display();
        }
    }
}
