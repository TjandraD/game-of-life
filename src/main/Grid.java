package main;
import java.util.Random;

public class Grid {
    private int [][] currentArray = new int[10][10];

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
}
