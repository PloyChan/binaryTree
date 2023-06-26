package org.example.binaryTree;

public class App 
{
    public static void main( String[] args )
    {
        Node node = new Node();
        node.root = new Node(5);
        node.insert(node.root,3);
        node.insert(node.root,4);
        node.insert(node.root,1);
        node.insert(node.root,2);

        node.insert(node.root,5);
        node.insert(node.root,8);
        node.insert(node.root,9);
        node.insert(node.root,10);
        node.insert(node.root,6);
        node.insert(node.root,7);
        //search
        node.search(node.root, 6);
        node.search(node.root, 60);
        System.out.println();
        //print tree
        node.treeWalk(node.root);
        System.out.println();
        //show all node
        node.print(node.root);
        //delete node
        node.delete(node.root,8);
        System.out.println();
        node.print(node.root);


        System.out.println();
        node.treeWalk(node.root);
    }
}
