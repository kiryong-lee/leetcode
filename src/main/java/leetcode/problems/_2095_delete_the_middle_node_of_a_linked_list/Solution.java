package leetcode.problems._2095_delete_the_middle_node_of_a_linked_list;

import leetcode.common.ListNode;

class Solution {

    public ListNode deleteMiddle(ListNode head) {

        int count = 0;
        for (ListNode current = head; current != null; current = current.next) {
            count++;
        }

        if (count == 1) {
            return null;
        }

        ListNode current = head;
        for (int i = 0; i < count / 2 - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;

        return head;
    }
}
