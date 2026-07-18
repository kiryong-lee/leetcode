package leetcode.problems._1929_concatenation_of_array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertArrayEquals(
                new int[]{1, 2, 1, 1, 2, 1},
                solution.getConcatenation(new int[]{1, 2, 1}));
    }

    @Test
    void sampleCase2() {
        assertArrayEquals(
                new int[]{1, 3, 2, 1, 1, 3, 2, 1},
                solution.getConcatenation(new int[]{1, 3, 2, 1}));
    }
}
