/*
 * Circular Linked List - Cycle Detection and Removal Steps:

 * 1. First, create the Node class to represent each node.
 * 2. Implement isCycle() to detect if there's a cycle using Floyd's algorithm.
 * 3. Implement removecycle() to remove the cycle from the linked list.
 * 4. Floyd's algorithm uses two pointers - slow (moves +1) and fast (moves +2).
 * 5. To remove cycle: Find meeting point, then move both pointers at same speed from head and meeting point.
 */

public class cll2 {
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

    public static void removecycle() {
        // step 1 - Detect cycle using Floyd's algorithm
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        
        // step 2 - If no cycle found, return
        if (cycle == false) {
            return;
        }

        // step 3 - Find meeting point
        // Reset slow to head, keep fast at meeting point
        slow = head;
        Node prev = null;
        
        // step 4 - Move both pointers by 1 until they meet
        while (slow != fast) {
            prev = fast; // Keep track of previous node
            slow = slow.next;
            fast = fast.next;
        }

        // step 5 - Remove cycle by setting previous node's next to null
        prev.next = null;
    }

    public static void main(String[] args) {
        // Create nodes with a cycle for testing
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        // Creates cycle: 6 -> 3 (creates a loop back to node 3)
        head.next.next.next.next.next.next = head.next.next;

        System.out.println(isCycle());
        
        // Remove the cycle
        removecycle();

        System.out.println(isCycle());
    }
}
