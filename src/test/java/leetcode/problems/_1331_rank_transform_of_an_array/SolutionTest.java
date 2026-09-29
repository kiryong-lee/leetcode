package leetcode.problems._1331_rank_transform_of_an_array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(new int[]{4, 1, 2, 3}, solution.arrayRankTransform(new int[]{40, 10, 20, 30}));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(new int[]{1, 1, 1}, solution.arrayRankTransform(new int[]{100, 100, 100}));
    }

    @Test
    void sampleCase3() {
        assertArrayEquals(
                new int[]{5, 3, 4, 2, 8, 6, 7, 1, 3},
                solution.arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12}));
    }
}
