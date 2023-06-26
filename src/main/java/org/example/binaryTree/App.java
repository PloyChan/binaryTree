package org.example.binaryTree;

public class App 
{
    public static void main( String[] args )
    {
        Node node = new Node();
         //Inserting nodes
        node.root = new Node(50);
        node.insert(node.root,10);
        node.insert(node.root,20);
        node.insert(node.root,70);
        node.insert(node.root,60);

        System.out.println("root : " + node.root.toString());

        int key = 6;
        int key2 = 10;
        node.search(node.root, key);
        node.search(node.root, key2);


        node.print(node.root);
        int keyToDelete = 60;
        node.delete(node.root,keyToDelete);
        System.out.println();
        node.print(node.root);
    }
}
