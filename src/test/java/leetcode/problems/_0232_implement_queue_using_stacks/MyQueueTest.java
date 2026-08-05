package leetcode.problems._0232_implement_queue_using_stacks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class MyQueueTest {

    @Test
    void sampleCase1() {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.peek());
        assertEquals(1, queue.pop());
        assertFalse(queue.empty());
    }
}
