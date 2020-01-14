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
            for (int i=0;i<mazeData.length;i++){
                line = in.readLine();
                for (int ii=0;ii<mazeData[i].length;ii++){
                    char codeChar = line.charAt(ii);
                    if (codeChar == '#'){
                        mazeData[i][ii] = 1;
                    }else if (codeChar == ' '){
                        mazeData[i][ii] = 0;
                    }else if (codeChar == 's'){
                        //startPos?
                    }else if (codeChar == 'G'){
                        goalPos = new Vector2(ii, i);
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public boolean canMove(Vector2 dist){
        return getCode(dist) == 0;
    }
    public boolean isGoal(Vector2 pos){
        return goalPos.equal(pos);
    }
    public int getCode(Vector2 pos){
        return mazeData[pos.y][pos.x];
    }
    public Vector2 getStartPos(){
        return startPos;
    }
}
