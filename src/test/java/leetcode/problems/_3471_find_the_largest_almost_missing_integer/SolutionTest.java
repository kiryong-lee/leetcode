package leetcode.problems._3471_find_the_largest_almost_missing_integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(7, solution.largestInteger(new int[]{3, 9, 2, 1, 7}, 3));
    }

    @Test
    void sampleCase2() {
        assertEquals(3, solution.largestInteger(new int[]{3, 9, 7, 2, 1, 7}, 4));
    }

    @Test
    void sampleCase3() {
        assertEquals(-1, solution.largestInteger(new int[]{0, 0}, 1));
    }
}
