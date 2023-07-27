import java.util.*;
public class MineMap {
    private final int row;
    private final int column;
    String[][] mineMap;
    ArrayList<Integer> list;

    MineMap(int row, int column) {
        this.row = row;
        this.column = column;
        setMineMap();
    }

    public void setMineMap() {
        int elementNo = this.row * this.column;
        int mineNumber = elementNo / 4;
        int xAxis;
        int yAxis;

        mineMap = new String[row][column];
        list = new ArrayList<Integer>();

        for (int i = 0; i < elementNo; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mineMap[i][j] = "0";
            }
        }

        for (int i = 0; i < mineNumber; i++) {
            int index = list.get(i);
            xAxis = index / column;
            yAxis = index % column;
            mineMap[xAxis][yAxis] = "*";
        }
    }

    public void getMineMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }
}
