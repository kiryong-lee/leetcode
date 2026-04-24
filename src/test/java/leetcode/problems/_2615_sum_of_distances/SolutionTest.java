package leetcode.problems._2615_sum_of_distances;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase() {
        long[] actual = solution.distance(new int[]{1, 3, 1, 1, 2});

        assertArrayEquals(new long[]{5, 0, 3, 4, 0}, actual);
    }

    @Test
    void sampleCase2() {
        long[] actual = solution.distance(new int[]{0, 5, 3});

        assertArrayEquals(new long[]{0, 0, 0}, actual);
    }

    @Test
    void allSameCase() {
        long[] actual = solution.distance(new int[]{1, 1, 1, 1, 1});

        assertArrayEquals(new long[]{10, 7, 6, 7, 10}, actual);
    }
}
