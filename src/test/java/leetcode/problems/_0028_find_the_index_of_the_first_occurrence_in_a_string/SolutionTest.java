package leetcode.problems._0028_find_the_index_of_the_first_occurrence_in_a_string;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }

    @Test
    void sampleCase2() {
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }
}
