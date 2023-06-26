package org.example.tree;

public class App {
    public static void main(String[] args) {
        Node root = new Node(50);
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        root.addChild(d);
        a.addChild(b);
        a.addChild(c);

        System.out.println("root: " + root);
        System.out.println("child of root: ");
        System.out.println("Parent B: "+b.getParent());
        System.out.println("Node D: " + d);
        root.print(root);
    }
}
