package JavaCodingRestart;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.util.Collections.reverse;


public class l62GenericTrees {
    static class Node{
        int val;
        List<Node> children;
        Node(int val){
            this.val = val;
            children = new ArrayList<>();
        }
    }

    private static void constructTree(Node root){
        root.children.add(new Node(30));
        root.children.add(new Node(11));
        root.children.add(new Node(41));
        root.children.get(0).children.add(new Node(31));
        root.children.get(0).children.add(new Node(33));
        root.children.get(0).children.add(new Node(34));
        root.children.get(1).children.add(new Node(35));
        root.children.get(1).children.add(new Node(36));
        root.children.get(1).children.add(new Node(37));
        root.children.get(2).children.add(new Node(38));
        root.children.get(2).children.add(new Node(39));
        root.children.get(2).children.add(new Node(40));
    }

    public static void BFS(Node root, Queue<Node> q){
        if(q.isEmpty())return;
        Node temp = q.remove();
        System.out.print(temp.val + " ");
        for(int i = 0; i<temp.children.size();i++){
            q.add(temp.children.get(i));
        }
        BFS(root,q);
    }

    public static void zigzagBFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node temp = q.remove();

                if (leftToRight) {
                    level.add(temp.val);
                } else {
                    level.add(0, temp.val); // reverse insertion
                }

                for (Node child : temp.children) {
                    q.add(child);
                }
            }

            // print current level
            for (int val : level) {
                System.out.print(val + " ");
            }

            leftToRight = !leftToRight; // toggle direction
        }
    }

    public static int findMax(Node root){
        if(root.children.isEmpty()){
            return root.val;
        }
        int max = root.val;
        int n = root.children.size();
        for (int i = 0; i < n; i++){
            int maxChild = findMax(root.children.get(i));
            if(maxChild>max){
                max = maxChild;
            }
        }
        return max;
    }

    public static void mirrorTree(Node root){
        if(root.children.isEmpty()){
            return;
        }

        int noOfChildren = root.children.size();

        if (noOfChildren == 1)return;

        for (int i = 0; i < noOfChildren; i++) {
            mirrorTree(root.children.get(i));
            reverse(root.children);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        constructTree(root);
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);  // There Is No legit Inorder traversal for this but it is written here to just give an idea of it!
        System.out.println();
        Queue<Node> q = new java.util.LinkedList<>();
        q.add(root);
        BFS(root,q);
        System.out.println();
        zigzagBFS(root);
        System.out.println();
        System.out.println(findMax(root));
        mirrorTree(root);
        postOrder(root);
    }

    private static void preOrder(Node root) {
        if(root.children.isEmpty()){
            System.out.print(root.val + " ");
            return;
        }
        System.out.print(root.val + " ");
        int n = root.children.size();
        for(int i = 0 ; i<n;i++){
            preOrder(root.children.get(i));
        }
    }

    private static void postOrder(Node root) {
        if(root.children.isEmpty()){
            System.out.print(root.val + " ");
            return;
        }

        int n = root.children.size();
        for(int i = 0 ; i<n;i++){
            postOrder(root.children.get(i));
        }
        System.out.print(root.val + " ");
    }

    private static void inOrder(Node root) {
        if(root.children.isEmpty()){
            System.out.print(root.val + " ");
            return;
        }

        int n = root.children.size();
        for(int i = 0 ; i<(n/2);i++){
            inOrder(root.children.get(i));
        }

        System.out.print(root.val + " ");
        for(int i = (n/2);i<n;i++){
            inOrder(root.children.get(i));
        }
    }
}
