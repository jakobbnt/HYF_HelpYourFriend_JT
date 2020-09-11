package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Bug {
    private Node currentNode;
    private Stack<Node> route;
    private LinkedList<Node> forbiddenList;


    public Bug(){

    }

    public Bug(Node currentNode){
        this.currentNode = currentNode;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public Stack<Node> getRoute() {
        return route;
    }

    public void setRoute(Stack<Node> route) {
        this.route = route;
    }

    public LinkedList<Node> getForbiddenList() {
        return forbiddenList;
    }

    public void setForbiddenList(LinkedList<Node> forbiddenList) {
        this.forbiddenList = forbiddenList;
    }

    public int checkNodePointers(){
        if((this.currentNode.getPointer1() != null) && !forbiddenList.contains(this.currentNode.getPointer1())){
            return 1;
        }else if((this.currentNode.getPointer2() != null) && !forbiddenList.contains(this.currentNode.getPointer2())){
            return 2;
        }else if((this.currentNode.getPointer3() != null) && !forbiddenList.contains(this.currentNode.getPointer3())){
            return 3;
        }else {
            return 0;
        }
    }

    public void moveBack(){
        int i = 0;
        do{
            this.currentNode = route.pop();
            i = checkNodePointers();
        }while((i != 1) || (i != 2) || (i !=3));
        moveConfirmed(i);
    }

    public void moveConfirmed(int i){
        if(i == 1){
            this.currentNode = currentNode.getPointer1();
        }else if(i == 2){
            this.currentNode = currentNode.getPointer2();
        }else if(i == 3){
            this.currentNode = currentNode.getPointer3();
        }else{
            System.out.println("There is nowhere to go");
        }
    }

    public void moveForward(){
        switch (checkNodePointers()) {
            case 0:
                System.out.println("I have hit a dead end");
                moveBack();
                break;
            case 1:
                route.push(this.currentNode);
                if(!forbiddenList.contains(currentNode)) {
                    forbiddenList.add(currentNode);
                }
                this.currentNode = currentNode.getPointer1();
                break;
            case 2:
                route.push(this.currentNode);
                if(!forbiddenList.contains(currentNode)) {
                    forbiddenList.add(currentNode);
                }
                this.currentNode = currentNode.getPointer2();
                break;
            case 3:
                route.push(this.currentNode);
                if(!forbiddenList.contains(currentNode)) {
                    forbiddenList.add(currentNode);
                }
                this.currentNode = currentNode.getPointer3();
                break;
        }
    }

    public void goThroughMaze(Node goal){
        while (this.currentNode != goal){
            moveForward();
        }
    }
}
