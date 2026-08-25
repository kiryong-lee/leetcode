package leetcode.problems._3718_smallest_missing_multiple_of_k;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(10, solution.missingMultiple(new int[]{8, 2, 3, 4, 6}, 2));
    }

    @Test
    void sampleCase2() {
        assertEquals(5, solution.missingMultiple(new int[]{1, 4, 7, 10, 15}, 5));
    }
}
