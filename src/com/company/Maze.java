package com.company;

public class Maze {
    Node node0;
    Node node1;
    Node node2;
    Node node3;
    Node node4;
    Node node5;
    Node node6;
    Node node7;
    Node node8;
    Node node9;
    Node node10;
    Node node11;
    Node node12;
    Node node13;
    Node node14;
    Node node15;
    Node node16;
    Node node17;
    Node node18;
    Node node19;
    Node node20;
    Node node21;
    Node node22;
    Node node23;
    Node node24;
    Node node25;
    Node node26;
    Node node27;
    Node node28;
    Node node29;
    Node node30;
    Node node31;

    public Maze(){
        this.node0 = new Node("Node 0");
        this.node1 = new Node("Node 1");
        this.node2 = new Node("Node 2");
        this.node3 = new Node("Node 3");
        this.node4 = new Node("Node 4");
        this.node5 = new Node("Node 5");
        this.node6 = new Node("Node 6");
        this.node7 = new Node("Node 7");
        this.node8 = new Node("Node 8");
        this.node9 = new Node("Node 9");
        this.node10 = new Node("Node 10");
        this.node11 = new Node("Node 11");
        this.node12 = new Node("Node 12");
        this.node13 = new Node("Node 13");
        this.node14 = new Node("Node 14");
        this.node15 = new Node("Node 15");
        this.node16 = new Node("Node 16");
        this.node17 = new Node("Node 17");
        this.node18 = new Node("Node 18");
        this.node19 = new Node("Node 19");
        this.node20 = new Node("Node 20");
        this.node21 = new Node("Node 21");
        this.node22 = new Node("Node 22");
        this.node23 = new Node("Node 23");
        this.node24 = new Node("Node 24");
        this.node25 = new Node("Node 25");
        this.node26 = new Node("Node 26");
        this.node27 = new Node("Node 27");
        this.node28 = new Node("Node 28");
        this.node29 = new Node("Node 29");
        this.node30 = new Node("Node 30");
        this.node31 = new Node("Node 31");

        this.node0.setPointer1(node2);
        this.node1.setPointer1(node2);
        this.node1.setPointer2(node7);
        this.node2.setPointer1(node1);
        this.node2.setPointer2(node3);
        this.node3.setPointer1(node2);
        this.node3.setPointer2(node4);
        this.node4.setPointer1(node3);
        this.node4.setPointer2(node10);
        this.node5.setPointer1(node11);
        this.node5.setPointer2(node6);
        this.node6.setPointer1(node5);
        this.node6.setPointer2(node12);
        this.node7.setPointer1(node8);
        this.node7.setPointer2(node1);
        this.node8.setPointer1(node7);
        this.node8.setPointer2(node14);
        this.node9.setPointer1(node15);
        this.node9.setPointer2(node10);
        this.node10.setPointer1(node9);
        this.node10.setPointer2(node4);
        this.node11.setPointer1(node17);
        this.node11.setPointer2(node5);
        this.node12.setPointer1(node18);
        this.node12.setPointer2(node6);
        this.node13.setPointer1(node19);
        this.node14.setPointer1(node20);
        this.node14.setPointer2(node8);
        this.node15.setPointer1(node16);
        this.node15.setPointer2(node9);
        this.node16.setPointer1(node15);
        this.node16.setPointer2(node22);
        this.node16.setPointer3(node17);
        this.node17.setPointer1(node16);
        this.node17.setPointer2(node11);
        this.node18.setPointer1(node24);
        this.node18.setPointer2(node12);
        this.node19.setPointer1(node20);
        this.node19.setPointer2(node13);
        this.node20.setPointer1(node19);
        this.node20.setPointer2(node14);
        this.node21.setPointer1(node22);
        this.node22.setPointer1(node21);
        this.node22.setPointer2(node16);
        this.node23.setPointer1(node29);
        this.node23.setPointer2(node24);
        this.node24.setPointer1(node23);
        this.node24.setPointer2(node18);
        this.node25.setPointer1(node26);
        this.node26.setPointer1(node25);
        this.node26.setPointer2(node27);
        this.node27.setPointer1(node26);
        this.node27.setPointer2(node31);
        this.node27.setPointer3(node28);
        this.node28.setPointer1(node27);
        this.node28.setPointer2(node29);
        this.node29.setPointer1(node28);
        this.node29.setPointer2(node30);
        this.node30.setPointer1(node29);
        this.node31.setPointer1(node27);

    }
}
