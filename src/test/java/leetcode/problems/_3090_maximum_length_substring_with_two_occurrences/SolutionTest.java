package leetcode.problems._3090_maximum_length_substring_with_two_occurrences;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(4, solution.maximumLengthSubstring("bcbbbcba"));
    }

    @Test
    void sampleCase2() {
        assertEquals(2, solution.maximumLengthSubstring("aaaa"));
    }
}
