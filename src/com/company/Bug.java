package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class Bug {
    private Node currentNode;
    private Stack<Node> route = new Stack<>();
    private LinkedList<Node> forbiddenList = new LinkedList<>();


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

    //Checker om den nuværende nodes pointers ikke er null eller den ikke er med id forbiddenList
    //Returner så det tal som passer til den node der skal bevæges til
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

    //Metoden som sender buggen et skridt tilbage ved at bruge Stack.pop()
    public void moveBack(){
        int i = 0;
        do{
            this.currentNode = route.pop();
            System.out.println("I have moved back to:" + this.currentNode);
            //Den tjekker så den nye nodes pointers.
            i = checkNodePointers();
        //loopet bliver ved med kører indtil en pointer er ledig.
        }while(i == 0);
        System.out.println();
    }

    //Metode som bruger en switch til at bestemme hvilken node der skal rykkes til.
    public void moveForward(){
        //checkNodePointer metoden returner en int i forhold til hvilken node der skal bevæges til
        switch (checkNodePointers()) {
            //Hvis checkNodePointers returner 0 skal der bevæges baglens.
            case 0:
                System.out.println("I have hit a dead end");
                if(!forbiddenList.contains(currentNode)) {
                    forbiddenList.add(currentNode);
                }
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
    //Metoden som får bugen til at gå starte sin tur.
    //Med målet parameteroverført.
    public void goThroughMaze(Node goal) throws NullPointerException{
        //Dette loop kører igennem indtil bugen har nået sit mål.
        while (this.currentNode != goal){
            System.out.println(this.currentNode);
            //Selve metoden der får buggen til at bevæge sig fremad.
            //metoden er på linje 79
            moveForward();
        }
        if(this.currentNode.getName().equals("Node 31")){
            System.out.println(this.currentNode);
            System.out.println("I have reached the goal!");
        }
    }

}
