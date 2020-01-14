package jp.ac.uryukyu.ie.ex2.pair11;

import java.io.*;

public class Maze {
    Vector2 mazeSize;//迷路のサイズ
    int[][] mazeData;//マップ情報　0:空白　1:壁
    Vector2 startPos;//初期位置
    Vector2 goalPos;//ゴール位置

    public void load(String filePath){
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filePath)))){
            String line;
            line = in.readLine();
            String[] temp = line.split(" ");
            startPos = new Vector2(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            line = in.readLine();
            temp = line.split(" ");
            mazeData = new int[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])];

            //迷路読む
        } catch (FileNotFoundException e){
            e.printStackTrace();
            System.exit(-1); // 0 以外は異常終了
        } catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }
    }
    public boolean canMove(Vector2 dist){
        return mazeData[dist.x][dist.y] == 0;
    }
    public boolean isGoal(Vector2 pos){
        return goalPos.equal(pos);
    }
    public int getCode(Vector2 pos){
        return mazeData[pos.x][pos.y];
    }
    public Vector2 getStartPos(){
        return startPos;
    }
}
