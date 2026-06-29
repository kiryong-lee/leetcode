package leetcode.problems._1967_number_of_strings_that_appear_as_substrings_in_word;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(3, solution.numOfStrings(new String[]{"a", "abc", "bc", "d"}, "abc"));
    }

    @Test
    void sampleCase2() {
        assertEquals(2, solution.numOfStrings(new String[]{"a", "b", "c"}, "aaaaabbbbb"));
    }

    @Test
    void sampleCase3() {
        assertEquals(3, solution.numOfStrings(new String[]{"a", "a", "a"}, "ab"));
    }
}
