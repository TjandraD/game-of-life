package main;
import java.util.Random;

public class Grid {
    private final int [][] currentArray = new int[10][10];

    public int[][] getCurrentArray() {
        return currentArray;
    }

    public void initializeGrid() {
        Random ran = new Random();

        for (int currentRow = 0; currentRow < 10; currentRow++) {
            for (int currentColumn = 0; currentColumn < 10; currentColumn++) {
                currentArray[currentRow][currentColumn] = ran.nextInt(2);
            }
        }
    }

    public int [] listNeighbours(int itemRow, int itemColumn) {
        int [] currentNeighbours = new int[8];
        int currentItemPosition = 0;

        for (int neighbourRow = itemRow - 1; neighbourRow <= itemRow + 1; neighbourRow++) {
            for (int neighbourColumn = itemColumn - 1; neighbourColumn <= itemColumn + 1; neighbourColumn++) {
                if (neighbourRow == itemRow && neighbourColumn == itemColumn) continue;

                currentNeighbours[currentItemPosition] = currentArray[neighbourRow][neighbourColumn];
                currentItemPosition++;
            }
        }

        return currentNeighbours;
    }

    public boolean checkIsAlive(int [] neighbourList, int currentItem) {
        int aliveCount = 0;
        for (int j : neighbourList) {
            if (j == 1) aliveCount++;
        }

        if (currentItem == 0) {
            return aliveCount == 3;
        } else {
            return aliveCount == 2 | aliveCount == 3;
        }
    }
}
