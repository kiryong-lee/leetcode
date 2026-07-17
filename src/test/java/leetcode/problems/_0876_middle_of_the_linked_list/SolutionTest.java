package leetcode.problems._0876_middle_of_the_linked_list;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        ListNode actual = solution.middleNode(listOf(1, 2, 3, 4, 5));

        assertArrayEquals(new int[]{3, 4, 5}, toArray(actual));
    }

    @Test
    void sampleCase2() {
        ListNode actual = solution.middleNode(listOf(1, 2, 3, 4, 5, 6));

        assertArrayEquals(new int[]{4, 5, 6}, toArray(actual));
    }

    private ListNode listOf(int... values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }

    private int[] toArray(ListNode head) {
        int length = 0;
        for (ListNode current = head; current != null; current = current.next) {
            length++;
        }

        int[] values = new int[length];
        ListNode current = head;
        for (int i = 0; i < length; i++) {
            values[i] = current.val;
            current = current.next;
        }
        return values;
    }
}
