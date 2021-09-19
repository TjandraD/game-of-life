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
}
