// Queue Reversal using Stack

import java.util.*;

public class queue9 {
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Step 1: Dequeue all elements from the queue and push them onto the stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // Step 2: Pop all elements from the stack and enqueue them back to the queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);

    }
}
