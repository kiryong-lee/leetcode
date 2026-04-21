package leetcode.problems._0002_add_two_numbers;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase() {
        ListNode actual = solution.addTwoNumbers(
            listOf(2, 4, 3), listOf(5, 6, 4));

        assertArrayEquals(new int[]{7, 0, 8}, toArray(actual));
    }

    @Test
    void sampleCase2() {
        ListNode actual = solution.addTwoNumbers(
            listOf(9,9,9,9,9,9,9), listOf(9,9,9));

        assertArrayEquals(new int[]{8,9,9,9,0,0,0,1}, toArray(actual));
    }

    private ListNode listOf(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    private int[] toArray(ListNode head) {
        int length = 0;
        ListNode current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        int[] values = new int[length];
        current = head;

        for (int i = 0; i < length; i++) {
            values[i] = current.val;
            current = current.next;
        }

        return values;
    }
}
