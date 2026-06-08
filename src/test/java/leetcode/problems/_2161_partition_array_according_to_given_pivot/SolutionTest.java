package leetcode.problems._2161_partition_array_according_to_given_pivot;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        int[] actual = solution.pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10);

        assertArrayEquals(new int[]{9, 5, 3, 10, 10, 12, 14}, actual);
    }

    @Test
    void sampleCase2() {
        int[] actual = solution.pivotArray(new int[]{-3, 4, 3, 2}, 2);

        assertArrayEquals(new int[]{-3, 2, 4, 3}, actual);
    }

}
