package org.example.binaryTree;

public class Node {
     Node root;
     private Node left , right;
    private int value;

    public Node() {
        root = null;
    }
    Node(int value){
        this.value = value;
    }
    public Node insert(Node node,int key){
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if(key < node.value){
            node.left = insert(node.left , key);
            System.out.println("node L : " + node.left);

        } else if (key > node.value) {
            node.right = insert(node.right , key);
            System.out.println("node R: " +node.right);
        }
        return node;
    }

    public void search(Node node, int key) {
        if(node == null){
            System.out.println(key + " not found");
        } else {
            if(node.value == key){
                System.out.println(key + " found");
            } else {
                if (node.value < key){
                    search(node.right,key);
                } else {
                    search(node.left , key);
                }
            }
        }
    }
    Node delete(Node node, int key) {
        if (node == null){
            return node;
        }

        if (key < node.value)
            node.left = delete(node.left, key);
        else if (key > node.value)
            node.right = delete(node.right, key);
        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            node.value = minValue(node.right);
            node.right = delete(node.right, node.value);
        }
        return node;
    }

    int minValue(Node root) {
        int min = root.value;
        while (root.left != null) {
            min = root.left.value;
            root = root.left;
        }
        return min;
    }

    public void print(Node node){
        if (node != null) {
            print(node.left);
            System.out.print(node.value + " ");
            print(node.right);
        }
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
