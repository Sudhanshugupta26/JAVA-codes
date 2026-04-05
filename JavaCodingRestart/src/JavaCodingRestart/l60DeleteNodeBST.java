package JavaCodingRestart;

import java.util.LinkedList;
import java.util.Queue;

public class l60DeleteNodeBST {
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
    static int countSum(Node root){
        if(root==null)return 0;
        return countSum(root.left) + root.val + countSum(root.right);
    }

    public static void main(String[] args) {
        String arr[] = {"50", "20", "60","17","34","55" ,"89","10","","28","","","","70","","","14"};
        Node root = constructBFS(arr);
        System.out.println(countSum(root) );
        preorder(root);
        System.out.println();

        Node temp = new Node(Integer.MAX_VALUE);    // This will ensure if we have to delete the root node of the whole tree.
        temp.left = root;
        deleteNode(temp,34);
        preorder(root);
    }

    private static void deleteNode(Node root, int val) {
        if(root==null)return;
        if(val<root.val){
            if(root.left==null)return;
            if(root.left.val==val){
                Node l = root.left;
                if(l.right==null && l.left==null) root.left=null;   // 0 child
                else if(l.right==null || l.left==null){ // 1 child
                    if(l.right==null)root.left=l.left;
                    else root.left=l.right;
                }else{  // 2 child
                    Node curr = l;  // Morris Traversal
                    Node pred = l.left;
                    while(pred.right!=null){
                        pred = pred.right;
                    }
                    deleteNode(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.left = pred;
                }
            }
            else deleteNode(root.left,val);
        }else{
            if(root.right==null)return;
            if(root.right.val==val) {
                Node r = root.right;
                if (r.right == null && r.left == null) root.right = null;
                else if (r.right == null || r.left == null) {
                    if (r.right == null) root.right = r.left;
                    else root.right = r.right;
                }else{  // 2 child
                    Node curr = r;  // Morris Traversal
                    Node pred = r.left;
                    while(pred.right!=null){
                        pred = pred.right;
                    }
                    deleteNode(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            }
            else deleteNode(root.right,val);
        }
    }

    private static void preorder(Node root) {
        if(root==null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
