package leetcode.problems._3658_gcd_of_odd_and_even_sums;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(4, solution.gcdOfOddEvenSums(4));
    }

    @Test
    void sampleCase2() {
        assertEquals(5, solution.gcdOfOddEvenSums(5));
    }
}
