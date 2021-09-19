package test;
import main.Grid;
import org.junit.Test;
import static org.junit.Assert.*;

public class GridTest {
    @Test
    public void testInitializeGrid() {
        Grid grid = new Grid();
        grid.initializeGrid();

        assertEquals(10, grid.getCurrentArray().length);
    }

    @Test
    public void testListNeighbours() {
        Grid grid = new Grid();
        grid.initializeGrid();

        int [][] currentGrid = grid.getCurrentArray();
        int [] neighbourList = grid.listNeighbours(1, 1);

        assertEquals(currentGrid[0][0], neighbourList[0]);
    }
}
