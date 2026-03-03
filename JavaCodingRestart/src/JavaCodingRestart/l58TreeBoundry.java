package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;

public class l58TreeBoundry {
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
        String arr[] = {"1", "2", "3","4","5","" ,"6","7","","8","","9","10", "","11","", "12","","13","","14","15","16","","17","","","18","","19","","","","20","21","22","23","","24","25","26","27","","","28","",""};
        Node root = constructBFS(arr);
        boundryDisplay(root);
    }

    private static void boundryDisplay(Node root) {
        LeftBoundry(root);
        Leaves(root);
        RightBoundry(root.right);
    }

    private static void RightBoundry(Node root) {
        if(root==null || (root.left==null && root.right==null))return ;

        if (root.right!=null)RightBoundry(root.right);
        else RightBoundry(root.left);
        System.out.print(root.val+" ");
    }

    private static void Leaves(Node root) {
        if(root==null)return;
        if(root.left==null && root.right==null)System.out.print(root.val+" ");
        Leaves(root.left);
        Leaves(root.right);
    }

    private static void LeftBoundry(Node root) {
        if(root==null || (root.left==null && root.right==null))return ;
        System.out.print(root.val+" ");
        if (root.left!=null)LeftBoundry(root.left);
        else LeftBoundry(root.right);
    }
}
