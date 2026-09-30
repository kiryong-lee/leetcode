package leetcode.problems._1260_shift_2d_grid;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(
                List.of(List.of(9, 1, 2), List.of(3, 4, 5), List.of(6, 7, 8)),
                solution.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1));
    }

    @Test
    void sampleCase2() {
        assertEquals(
                List.of(
                        List.of(12, 0, 21, 13),
                        List.of(3, 8, 1, 9),
                        List.of(19, 7, 2, 5),
                        List.of(4, 6, 11, 10)),
                solution.shiftGrid(new int[][]{
                        {3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4));
    }

    @Test
    void sampleCase3() {
        assertEquals(
                List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9)),
                solution.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9));
    }
}
