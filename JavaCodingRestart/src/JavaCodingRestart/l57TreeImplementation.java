package JavaCodingRestart;

public class l57TreeImplementation {
    public static class Node{
        int val;    //initial 0
        Node left;  //initial null
        Node right; //initial null
        public Node(int i){
            val = i;
        }
    }

    public static void display(Node root){
        if(root==null)return;
        System.out.println(root.val);
        display(root.left);
        display(root.right);
    }

    public static int size(Node a){
        if(a==null) return 0;
        return 1+size(a.left)+size(a.right);
    }

    public static int sum(Node a){
        if(a==null) return 0;
        return a.val+sum(a.left)+sum(a.right);
    }

    public static int product(Node a){
        if(a==null) return 1;
        return a.val*sum(a.left)*sum(a.right);
    }

    public static int maxVal(Node a){
        if(a==null) return Integer.MIN_VALUE;
        return Math.max(maxVal(a.left),Math.max(maxVal(a.right),a.val));
    }

    public static int minVal(Node a){
        if(a==null) return Integer.MAX_VALUE;
        return Math.min(maxVal(a.left),Math.min(maxVal(a.right),a.val));
    }

    public static int height(Node a){
        if(a==null) return -1;
        return 1+Math.max(height(a.left),height(a.right));
    }

    public static void main(String[] args) {
        Node root = new Node(-100);
        Node a = new Node(2);
        Node b = new Node(33);
        Node c = new Node(4);
        Node d = new Node(52);
        Node e = new Node(6);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;

        display(root);
        System.out.print("Size is: ");
        System.out.println(size(root));
        System.out.println("Sum is: "+sum(root));
        System.out.println("Max is: "+maxVal(root));
        System.out.println("Height is: "+height(root));
        System.out.println("Product is: "+product(root));
        System.out.println("Min is: "+minVal(root));
    }
}
