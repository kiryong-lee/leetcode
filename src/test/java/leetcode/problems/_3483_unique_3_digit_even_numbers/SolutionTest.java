package leetcode.problems._3483_unique_3_digit_even_numbers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(12, solution.totalNumbers(new int[]{1, 2, 3, 4}));
    }

    @Test
    void sampleCase2() {
        assertEquals(2, solution.totalNumbers(new int[]{0, 2, 2}));
    }

    @Test
    void sampleCase3() {
        assertEquals(1, solution.totalNumbers(new int[]{6, 6, 6}));
    }

    @Test
    void sampleCase4() {
        assertEquals(0, solution.totalNumbers(new int[]{1, 3, 5}));
    }
}
