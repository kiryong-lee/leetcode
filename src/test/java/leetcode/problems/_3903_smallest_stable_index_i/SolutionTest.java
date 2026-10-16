package leetcode.problems._3903_smallest_stable_index_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.firstStableIndex(new int[]{5, 0, 1, 4}, 3));
    }

    @Test
    void sampleCase2() {
        assertEquals(-1, solution.firstStableIndex(new int[]{3, 2, 1}, 1));
    }

    @Test
    void sampleCase3() {
        assertEquals(0, solution.firstStableIndex(new int[]{0}, 0));
    }
}
