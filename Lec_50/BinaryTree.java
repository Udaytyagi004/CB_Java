package Lec_50;

import java.util.*;

public class BinaryTree {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public BinaryTree(){
        root = createTree();
    }
    Scanner sc = new Scanner(System.in);
    private Node createTree(){
        Node node = new Node();
        int item = sc.nextInt();
        node.val = item;

        boolean hlc = sc.nextBoolean();
        if(hlc){
            node.left = createTree();
        }
        boolean hrc = sc.nextBoolean();
        if(hrc){
            node.right = createTree();
        }
        return node;
    }

    public void Display(){
        Node node = root;
        Display(node);
    }

    private void Display(Node node) {
        if(node == null) return;
        String s = "<--" + node.val + "-->";
        if(node.left != null){
            s = node.left.val + s;
        }else{
            s = "." + s;
        }
        if(node.right != null){
            s = s + node.right.val;
        }else{
            s = s + ".";
        }
        System.out.println(s);
        Display(node.left);
        Display(node.right);
    }

    public boolean find(int item){
        return find(root , item);
    }
    private boolean find(Node node , int item){
        if(node == null) return false;
        if(node.val == item) return true;
        return find(node.left , item) || find(node.right , item);
    }
    public int max(){
        return max(root);
    }
    private int max(Node node){
        if(node == null) return Integer.MIN_VALUE;
        int x = max(node.left);
        int y = max(node.right);
        return Math.max(node.val , Math.max(x, y));
    }
    public int min(){
        return min(root);
    }
    private int min(Node node){
        if(node == null) return Integer.MAX_VALUE;
        int x = min(node.left);
        int y = min(node.right);
        return Math.min(node.val , Math.min(x, y));
    }

    public int height() {
        return height(root);
    }
    private int height(Node node){
        if(node == null) return -1;
        return Math.max(height(node.left) , height(node.right)) + 1;
    }
    

     // Pre-Order  Traversal
    public void traversePre(){
         traversePre(root);
         System.out.println();
    }
    private void traversePre(Node node)
    {
        if(node == null) return;
        System.out.print(node.val + " , ");
        traversePre(node.left);
        traversePre(node.right);
    }
// Post-Order Traversal 
    public void traversePost(){
         traversePost(root);
         System.out.println();
    }
    private void traversePost(Node node)
    {
        if(node == null) return;
       
        traversePost(node.left);
        traversePost(node.right);
        System.out.print(node.val + " , ");
    }
// In-Order Traversal
    public void traverseIn(){
         traverseIn(root);
         System.out.println();
    }
    private void traverseIn(Node node)
    {
        if(node == null) return;
        
        traverseIn(node.left);
        System.out.print(node.val + " , ");
        traverseIn(node.right);
    }

    // Level-Order Traversal 
    public void traversalLevel() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node n = q.poll();
            System.out.print(n.val + " , ");
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
        }
        System.out.println();
    }
    
}
