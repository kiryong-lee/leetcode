package leetcode.problems._0412_fizz_buzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        assertEquals(List.of("1", "2", "Fizz"), solution.fizzBuzz(3));
    }

    @Test
    void sampleCase2() {
        assertEquals(
                List.of("1", "2", "Fizz", "4", "Buzz"),
                solution.fizzBuzz(5));
    }

    @Test
    void sampleCase3() {
        assertEquals(
                List.of(
                        "1", "2", "Fizz", "4", "Buzz",
                        "Fizz", "7", "8", "Fizz", "Buzz",
                        "11", "Fizz", "13", "14", "FizzBuzz"),
                solution.fizzBuzz(15));
    }
}
