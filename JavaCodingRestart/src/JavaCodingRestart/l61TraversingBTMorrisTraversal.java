package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;

public class l61TraversingBTMorrisTraversal {
    // The Space complexity is O(1)!! & Time complexity is O(n) rather it is calling multiple while loops.
    // For Balanced Binary Tree, this traversal has the worst case.
    // This traversal can be done on any tree rather it is a normal BT or BST.
    public static void MorrisTraversalInOrder(Node root){
        Node curr = root;
        while(curr!=null) {
            if (curr.left != null) { // finding pred
                Node pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }
                if (pred.right == null) { // connect pred with curr
                    pred.right = curr;
                    curr = curr.left;
                }
                if (pred.right == curr) { // unlink pred and curr
                    pred.right = null;
                    System.out.print(curr.val + " ");
                    curr = curr.right;
                }
            } else {
                System.out.print(curr.val + " ");
                curr = curr.right;
            }
        }
    }

    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int i){
            val = i;
        }
    }

    public static Node constructBFS(String arr[]){
        int x= Integer.parseInt(arr[0]);
        int h = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i =1;
        while(i<h-1){
            Node temp = q.remove();
            Node left = new Node(0);
            Node right = new Node(0);
            if(arr[i].equals(""))left=null;
            else{
                int l = Integer.parseInt(arr[i]);
                left = new Node(l);
                q.add(left);
            }
            if(arr[i+1].equals(""))right=null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right = new Node(r);
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
    }

    public static void main(String[] args) {
        String arr[] = {"50", "20", "60","17","34","55" ,"89","10","","28","","","","70","","","14"};
        Node root = constructBFS(arr);
        MorrisTraversalInOrder(root);
    }
}
