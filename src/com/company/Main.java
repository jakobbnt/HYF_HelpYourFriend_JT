package com.company;

public class Main {

    public static void main(String[] args) throws NullPointerException{
        Maze maze = new Maze();
        Bug bug = new Bug(maze.node0);
        bug.goThroughMaze(maze.node31);

    }
}
