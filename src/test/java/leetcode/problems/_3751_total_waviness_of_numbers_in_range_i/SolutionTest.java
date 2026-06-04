package leetcode.problems._3751_total_waviness_of_numbers_in_range_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        int actual = solution.totalWaviness(120, 130);

        assertEquals(3, actual);
    }

    @Test
    void sampleCase2() {
        int actual = solution.totalWaviness(198, 202);

        assertEquals(3, actual);
    }

    @Test
    void sampleCase3() {
        int actual = solution.totalWaviness(4848, 4848);

        assertEquals(2, actual);
    }
}
