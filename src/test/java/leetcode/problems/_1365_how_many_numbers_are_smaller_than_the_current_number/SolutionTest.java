package leetcode.problems._1365_how_many_numbers_are_smaller_than_the_current_number;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(
                new int[]{4, 0, 1, 1, 3},
                solution.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3}));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(
                new int[]{2, 1, 0, 3},
                solution.smallerNumbersThanCurrent(new int[]{6, 5, 4, 8}));
    }

    @Test
    void sampleCase3() {
        assertArrayEquals(
                new int[]{0, 0, 0, 0},
                solution.smallerNumbersThanCurrent(new int[]{7, 7, 7, 7}));
    }
}
