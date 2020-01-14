package jp.ac.uryukyu.ie.ex2.pair11;

public class Vector2 {
    public int x;
    public int y;

    public Vector2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public boolean equal(Vector2 target){
        return x == target.x && y == target.y;
    }
}
