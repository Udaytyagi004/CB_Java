package Lec_50;

import Lec_50.BinaryTree.Node;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.Display();
        System.out.println(bt.find(310));
        System.out.println(bt.max());
        System.out.println(bt.min());
        System.out.println(bt.height());

        bt.traverseIn();
        bt.traversePost();
        bt.traversePre();
        bt.traversalLevel();
    }


   
}
