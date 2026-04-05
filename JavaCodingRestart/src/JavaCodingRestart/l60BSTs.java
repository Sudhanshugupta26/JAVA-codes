package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;

public class l60BSTs {
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
        String arr[] = {"10", "5", "15","2","8","12" ,"17"};
        Node root = constructBFS(arr);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
    }

    private static void inorder(Node root) {
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    private static void postorder(Node root) {
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    private static void preorder(Node root) {
        if(root==null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
