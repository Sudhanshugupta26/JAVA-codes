package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;

public class l57PrePostInTreeTraversal {
    public static class Node{
        int val;    //initial 0
        Node left;  //initial null
        Node right; //initial null
        public Node(int i){
            val = i;
        }
    }

    public static void preOrder(Node root){
        if(root==null)return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }

    public static void nthLevel(Node root, int n){
        if(root==null)return;
        if(n==1) {
            System.out.print(root.val+" ");
            return; // This reduces time complexity
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }

    public static void bfs(Node root){  //Iterative way, Not recursion.
        Queue<Node> q = new LinkedList<>();
        if(root!=null)q.add(root);
        while(q.size()>0){
            Node temp = q.peek();
            if(temp.left!=null)q.add(temp.left);
            if(temp.right!=null)q.add(temp.right);
            q.remove();
            System.out.print(temp.val+" ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        nthLevel(root, 3);
        System.out.println();
        bfs(root); 
    }
}
