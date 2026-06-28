package leetcode.problems._0021_merge_two_sorted_lists;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        ListNode actual = solution.mergeTwoLists(listOf(1, 2, 4), listOf(1, 3, 4));

        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, toArray(actual));
    }

    @Test
    void sampleCase2() {
        ListNode actual = solution.mergeTwoLists(null, null);

        assertArrayEquals(new int[]{}, toArray(actual));
    }

    @Test
    void sampleCase3() {
        ListNode actual = solution.mergeTwoLists(null, listOf(0));

        assertArrayEquals(new int[]{0}, toArray(actual));
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
