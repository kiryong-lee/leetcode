package leetcode.problems._3963_create_grid_with_exactly_one_path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertValidGrid(solution.createGrid(2, 3), 2, 3);
    }

    @Test
    void sampleCase2() {
        assertValidGrid(solution.createGrid(3, 3), 3, 3);
    }

    @Test
    void sampleCase3() {
        assertValidGrid(solution.createGrid(1, 4), 1, 4);
    }

    @Test
    void singleCell() {
        assertValidGrid(solution.createGrid(1, 1), 1, 1);
    }

    @Test
    void singleColumn() {
        assertValidGrid(solution.createGrid(4, 1), 4, 1);
    }

    private void assertValidGrid(String[] grid, int m, int n) {
        assertNotNull(grid);
        assertEquals(m, grid.length);

        int[][] paths = new int[m + 1][n + 1];
        paths[0][1] = 1;
        for (int i = 0; i < m; i++) {
            assertNotNull(grid[i]);
            assertEquals(n, grid[i].length());
            for (int j = 0; j < n; j++) {
                char cell = grid[i].charAt(j);
                assertTrue(cell == '.' || cell == '#');
                if (cell == '.') {
                    // 경로는 0개, 1개, 2개 이상만 구분합니다.
                    paths[i + 1][j + 1] = Math.min(2, paths[i][j + 1] + paths[i + 1][j]);
                }
            }
        }

        assertEquals(1, paths[m][n]);
    }
}
