package leetcode.problems._1480_running_sum_of_1d_array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(
                new int[]{1, 3, 6, 10},
                solution.runningSum(new int[]{1, 2, 3, 4}));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5},
                solution.runningSum(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    void sampleCase3() {
        assertArrayEquals(
                new int[]{3, 4, 6, 16, 17},
                solution.runningSum(new int[]{3, 1, 2, 10, 1}));
    }
}
