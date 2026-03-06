/*
 * Circular Linked List Implementation Steps:

 * 1. First, create the Node class to represent each node.
 * 2. Implement isCycle() to detect if there's a cycle using Floyd's algorithm.
 * 3. Floyd's algorithm uses two pointers - slow (moves +1) and fast (moves +2).
 * 4. If slow and fast meet at any point, a cycle exists in the linked list.
 */

import org.w3c.dom.Node;

public class cll1 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    // public static int size;

    public static boolean isCycle() { // Floyd's CFA (Cycle Finding Algorithm)
        // step 1 - Initialize slow and fast pointers at head
        Node slow = head;
        Node fast = head;

        // step 2 - Traverse the list until fast reaches the end
        while (fast != null && fast.next != null) {
            
            // step 3 - Move slow pointer by 1 step
            slow = slow.next; // +1
            
            // step 4 - Move fast pointer by 2 steps
            fast = fast.next.next; // +2
            
            // step 5 - Check if slow and fast meet
            if (slow == fast) {
                return true; // cycle exist
            }
        }
        
        // step 6 - If fast reaches end, no cycle exists
        return false; // cycle doesnot exist
    }

    public static void main(String[] args) {
        // Create nodes and form a cycle for testing
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head; // Creates cycle pointing back to head

        System.out.println(isCycle());
    }
}
