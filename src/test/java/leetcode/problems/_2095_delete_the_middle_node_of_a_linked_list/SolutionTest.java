package leetcode.problems._2095_delete_the_middle_node_of_a_linked_list;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sampleCase1() {
        ListNode actual = solution.deleteMiddle(listOf(1, 3, 4, 7, 1, 2, 6));

        assertArrayEquals(new int[]{1, 3, 4, 1, 2, 6}, toArray(actual));
    }

    @Test
    void sampleCase2() {
        ListNode actual = solution.deleteMiddle(listOf(1, 2, 3, 4));

        assertArrayEquals(new int[]{1, 2, 4}, toArray(actual));
    }

    @Test
    void sampleCase3() {
        ListNode actual = solution.deleteMiddle(listOf(2, 1));

        assertArrayEquals(new int[]{2}, toArray(actual));
    }

    @Test
    void deletesTheOnlyNode() {
        ListNode actual = solution.deleteMiddle(listOf(1));

        assertNull(actual);
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
