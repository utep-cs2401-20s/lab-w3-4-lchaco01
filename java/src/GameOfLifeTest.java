import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertArrayEquals;

class GameOfLifeTest {
    @Test
    public static void evolution() {
        int[][] a = {{0, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};
        int[][] b = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(a);
        x.evolution(1);
        assertArrayEquals(b, x.getBoard());
    }

    @Test
    public static void evolution1() {
        int[][] w = {{0, 1, 1, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};
        int[][] e = {{0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(w);
        x.evolution(1);
        assertArrayEquals(e, x.getBoard());
    }

    @Test
    public static void evolution2() {
        int[][] c = {{0, 1, 1, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        int[][] d = {{0, 1, 1, 1, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 1, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(c);
        x.evolution(1);
        assertArrayEquals(d, x.getBoard());
    }

    @Test
    public static void evolution3() {
        int[][] i = {{0, 1, 1,},
                {0, 1, 0,},
                {0, 0, 0,}};
        int[][] j = {{0, 1, 1},
                {0, 1, 1},
                {0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(i);
        x.evolution(1);
        assertArrayEquals(j, x.getBoard());
    }

    @Test
    public static void evolution4() {
        int[][] s = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        int[][] r = {{0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(s);
        x.evolution(1);
        assertArrayEquals(r, x.getBoard());
    }

    @Test
    public static void evolution5() {
        int[][] f = {{0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        int[][] t = {{0, 1, 1, 1, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(f);
        x.evolution(1);
        assertArrayEquals(t, x.getBoard());
    }

    @Test
    public static void neighbors() {
        int[][] a = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int row = 0;
        int col = 2;
        TorusGameOfLife sol = new TorusGameOfLife(a);
        assertEquals(0, sol.neighbors(row, col));
    }

    @Test
    public static void neighbors2() {
        int[][] a = {{0, 1, 1, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int row = 0;
        int col = 2;
        TorusGameOfLife sol = new TorusGameOfLife(a);
        assertEquals(3, sol.neighbors(row, col));
    }

    @Test
    public static void neighbors3() {
        int[][] a = {{1, 0, 1}, {0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        int row = 0;
        int col = 2;
        TorusGameOfLife sol = new TorusGameOfLife(a);
        assertEquals(6, sol.neighbors(row, col));
    }

    @Test
    public static void neighbors4() {
        int[][] a = {{0, 1}, {0, 0}};
        int row = 0;
        int col = 2;
        TorusGameOfLife sol = new TorusGameOfLife(a);
        assertEquals(0, sol.neighbors(row, col));
    }

    @Test
    public static void neighbors5() {
        int[][] a = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int row = 0;
        int col = 2;
        TorusGameOfLife sol = new TorusGameOfLife(a);
        assertEquals(3, sol.neighbors(row, col));
    }

    @Test
    public static void oneStep() {
        int[][] a = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}};
        int[][] b = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(a);
        x.oneStep();
        assertArrayEquals(b, x.getBoard());
    }

    @Test
    public static void oneStep2() {
        int[][] c = {{0, 0}, {0, 0}, {0, 0}};
        int[][] d = {{0, 0}, {0, 0}, {0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(c);
        x.oneStep();
        assertArrayEquals(d, x.getBoard());
    }

    @Test
    public static void oneStep3() {
        int[][] e = {{0, 0}, {0, 0}};
        int[][] f = {{0, 0}, {0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(e);
        x.oneStep();
        assertArrayEquals(f, x.getBoard());
    }

    @Test
    public static void oneStep4() {
        int[][] g = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] h = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(g);
        x.oneStep();
        assertArrayEquals(h, x.getBoard());
    }

    @Test
    public static void oneStep5() {
        int[][] i = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] j = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        TorusGameOfLife x = new TorusGameOfLife(i);
        x.oneStep();
        assertArrayEquals(j, x.getBoard());
    }

}