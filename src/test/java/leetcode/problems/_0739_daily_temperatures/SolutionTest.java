package leetcode.problems._0739_daily_temperatures;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(
                new int[]{1, 1, 4, 2, 1, 1, 0, 0},
                solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(
                new int[]{1, 1, 1, 0},
                solution.dailyTemperatures(new int[]{30, 40, 50, 60}));
    }

    @Test
    void sampleCase3() {
        assertArrayEquals(
                new int[]{1, 1, 0},
                solution.dailyTemperatures(new int[]{30, 60, 90}));
    }
}
