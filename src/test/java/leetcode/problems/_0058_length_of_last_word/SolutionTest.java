package leetcode.problems._0058_length_of_last_word;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    void sampleCase2() {
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void sampleCase3() {
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }
}
