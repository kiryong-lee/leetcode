package leetcode.problems._3612_process_string_with_special_operations_i;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals("ba", solution.processStr("a#b%*"));
    }

    @Test
    void sampleCase2() {
        assertEquals("", solution.processStr("z*#"));
    }

    @Test
    void handlesDeleteAndReverseOnEmptyResult() {
        assertEquals("", solution.processStr("*%"));
    }
}
