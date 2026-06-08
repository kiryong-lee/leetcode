package leetcode.problems._2574_left_and_right_sum_differences;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        int[] actual = solution.leftRightDifference(new int[]{10, 4, 8, 3});

        assertArrayEquals(new int[]{15, 1, 11, 22}, actual);
    }

    @Test
    void sampleCase2() {
        int[] actual = solution.leftRightDifference(new int[]{1});

        assertArrayEquals(new int[]{0}, actual);
    }

}
