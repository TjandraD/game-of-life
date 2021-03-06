package test;
import main.Grid;
import org.junit.Test;
import static org.junit.Assert.*;

public class GridTest {
    @Test
    public void testInitializeGrid() {
        Grid grid = new Grid();
        grid.initializeGrid();

        assertEquals(10, grid.getCurrentGrid().length);
    }

    @Test
    public void testListNeighbours() {
        Grid grid = new Grid();
        grid.initializeGrid();

        int [][] currentGrid = grid.getCurrentGrid();
        int [] neighbourList = grid.listNeighbours(1, 1);

        assertEquals(currentGrid[0][0], neighbourList[0]);
    }

    @Test
    public void testIsAlive() {
        Grid grid = new Grid();

        int [] neighbourList = { 1, 1, 1, 0, 0, 0, 0, 0 };

        assertTrue(grid.checkIsAlive(neighbourList, 1));
    }

    @Test
    public void testNextGeneration() {
        Grid grid = new Grid();
        grid.initializeGrid();

        int [][] oldGrid = grid.getCurrentGrid();

        grid.generateNextGeneration();

        int [][] currentGrid = grid.getCurrentGrid();

        assertNotEquals(oldGrid, currentGrid);
    }
}
