import java.util.ArrayList;
import java.util.Collections;

public class GameMap{

    private final int row;
    private final int column;
    String[][] gameMap;
    ArrayList<Integer> list;
    GameMap(int row, int column){
        this.row = row;
        this.column = column;
        setGameMap();
    }

    public void setGameMap(){
        int elementNo = this.row * this.column;
        int mineNumber = elementNo/4;
        int xAxis;
        int yAxis;

        gameMap = new String[row][column];
        list = new ArrayList<Integer>();

        for (int i=1; i<elementNo; i++){
            list.add(i);
        }
        Collections.shuffle(list);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                gameMap[i][j] = "o";
            }
        }
    }

    public void getGameMap(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }
}
