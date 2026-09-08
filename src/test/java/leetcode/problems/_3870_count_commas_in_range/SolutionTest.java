package leetcode.problems._3870_count_commas_in_range;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.countCommas(1002));
    }

    @Test
    void sampleCase2() {
        assertEquals(0, solution.countCommas(998));
    }
}
