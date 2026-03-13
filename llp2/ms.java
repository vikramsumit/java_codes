import java.util.LinkedList;

public class ms {
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
    public static int size;

    // slow fast approach
    public Node findMid(Node head) { // helper function for palindrome check
        Node slow = head; // turtle
        Node fast = head; // hare/rabbit

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow; // slow is my middle
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null || head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {

        if (head == null && head.next != null) {
            return head;
        }

        // find mid
        Node mid = findMid();

        // left & right ms
        Node rightHead = mid.next;
        mid.next = null;

        Node newleft = mergeSort(head);
        Node newright = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);

    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

    }
}
