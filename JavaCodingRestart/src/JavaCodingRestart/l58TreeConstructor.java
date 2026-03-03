package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;

public class l58TreeConstructor {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int i){
            val = i;
        }
    }
    public static int height(Node a){
        if(a==null) return -1;
        return 1+Math.max(height(a.left),height(a.right));
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
        String arr[] = {"1", "2", "3","4","5","" ,"6","","7","","","8","","","","9",""};
        Node root = constructBFS(arr);
        int h = height(root);
        for(int i=1;i<=h+1;i++){
            nthLevel(root,i);
            System.out.println();
        }
    }
}
