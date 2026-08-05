package leetcode.problems._0232_implement_queue_using_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {

    private final Deque<Integer> inputStack = new ArrayDeque<>();
    private final Deque<Integer> outputStack = new ArrayDeque<>();

    public MyQueue() {
    }

    public void push(int x) {
        inputStack.push(x);
    }

    public int pop() {
        moveIfNeeded();
        return outputStack.pop();
    }

    public int peek() {
        moveIfNeeded();
        return outputStack.peek();
    }

    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    private void moveIfNeeded() {
        if (!outputStack.isEmpty()) {
            return;
        }

        while (!inputStack.isEmpty()) {
            outputStack.push(inputStack.pop());
        }
    }
}
