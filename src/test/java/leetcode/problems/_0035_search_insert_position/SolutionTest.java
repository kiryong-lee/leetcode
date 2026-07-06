package leetcode.problems._0035_search_insert_position;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(2, solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    void sampleCase2() {
        assertEquals(1, solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    void sampleCase3() {
        assertEquals(4, solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
