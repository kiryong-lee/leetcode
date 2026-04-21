package leetcode.problems._0001_two_sum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void returnsIndicesForBasicCase() {
        int[] actual = solution.twoSum(new int[]{2, 7, 11, 15}, 9);

        assertArrayEquals(new int[]{0, 1}, actual);
    }

    @Test
    void handlesDuplicateValues() {
        int[] actual = solution.twoSum(new int[]{3, 3}, 6);

        assertArrayEquals(new int[]{0, 1}, actual);
    }
}
