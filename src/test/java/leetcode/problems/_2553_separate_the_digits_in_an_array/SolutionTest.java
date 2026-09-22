package leetcode.problems._2553_separate_the_digits_in_an_array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(
                new int[]{1, 3, 2, 5, 8, 3, 7, 7},
                solution.separateDigits(new int[]{13, 25, 83, 77})
        );
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(
                new int[]{7, 1, 3, 9},
                solution.separateDigits(new int[]{7, 1, 3, 9})
        );
    }
}
