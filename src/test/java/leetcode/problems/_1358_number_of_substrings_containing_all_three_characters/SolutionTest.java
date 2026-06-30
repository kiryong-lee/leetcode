package leetcode.problems._1358_number_of_substrings_containing_all_three_characters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(10, solution.numberOfSubstrings("abcabc"));
    }

    @Test
    void sampleCase2() {
        assertEquals(3, solution.numberOfSubstrings("aaacb"));
    }

    @Test
    void sampleCase3() {
        assertEquals(1, solution.numberOfSubstrings("abc"));
    }

}
