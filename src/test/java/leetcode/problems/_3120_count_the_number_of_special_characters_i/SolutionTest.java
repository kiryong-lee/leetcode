package leetcode.problems._3120_count_the_number_of_special_characters_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.numberOfSpecialChars("aaAbcBC"));
    }

    @Test
    void sampleCase2() {
        assertEquals(0, solution.numberOfSpecialChars("abc"));
    }

    @Test
    void sampleCase3() {
        assertEquals(1, solution.numberOfSpecialChars("abBCab"));
    }
}
