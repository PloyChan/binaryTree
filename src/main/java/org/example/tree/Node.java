package org.example.tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private Node parent;
    private Object value;
    private List<Node> childrenList;

    public Node(Object value) {
        this.value = value;
    }

    public Node(Node parent, Object value) {
        this.parent = parent;
        parent.addChild(this);
        this.value = value;
    }

    public void addChild(Node children) {
        if (childrenList == null) {
            childrenList = new ArrayList<>();
            childrenList.add(children);
            children.setParent(this);
        } else if (childrenList != null) {
            childrenList.add(children);
            children.setParent(this);
        }
    }
    public void print(Node root) {
        Node current = root;
        System.out.println(root);
        while (root != null) {
            if (current.getChildrenList() != null) {
                for (Node child : childrenList) {
                    System.out.print(child + " ");
                }
                break;
            }
        }
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildrenList() {
        return childrenList;
    }

    @Override
    public String toString() {
        return ""+value;
    }
}
