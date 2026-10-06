package leetcode.problems._3014_minimum_number_of_pushes_to_type_word_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(5, solution.minimumPushes("abcde"));
    }

    @Test
    void sampleCase2() {
        assertEquals(12, solution.minimumPushes("xycdefghij"));
    }
}
