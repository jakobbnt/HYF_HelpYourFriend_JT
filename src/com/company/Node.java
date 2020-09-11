package com.company;

public class Node {
    private String name;
    private Node pointer1;
    private Node pointer2;
    private Node pointer3;

    public Node() {

    }

    public Node(String name) {
        this.name = name;
    }

    public Node(String name, Node pointer1) {
        this.name = name;
        this.pointer1 = pointer1;
    }

    public Node(String name, Node pointer1, Node pointer2) {
        this.name = name;
        this.pointer1 = pointer1;
        this.pointer2 = pointer2;
    }

    public Node(String name, Node pointer1, Node pointer2, Node pointer3) {
        this.name = name;
        this.pointer1 = pointer1;
        this.pointer2 = pointer2;
        this.pointer3 = pointer3;
    }

    public Node getPointer1() {
        return pointer1;
    }

    public void setPointer1(Node pointer1) {
        this.pointer1 = pointer1;
    }

    public Node getPointer2() {
        return pointer2;
    }

    public void setPointer2(Node pointer2) {
        this.pointer2 = pointer2;
    }

    public Node getPointer3() {
        return pointer3;
    }

    public void setPointer3(Node pointer3) {
        this.pointer3 = pointer3;
    }
}
