package jp.ac.uryukyu.ie.ex2.pair11;

public class Main {
    public static void main(String[] args)
    {
        Maze maze = new Maze();
        maze.load("map.txt");
        Player player = new Player(maze.getStartPos());
        printMaze();
        player.move(Player.Direct.Left);
        printMaze();
        player.move(Player.Direct.Down);
        printMaze();
        player.move(Player.Direct.Right);
        printMaze();
    }
    static void printMaze(){

    }
}
