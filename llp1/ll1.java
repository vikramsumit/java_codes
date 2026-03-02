/*
 * Linked List Implementation Steps:

 * 1. First, create the Node class to represent each node.
 * 2. Implement addFirst() to insert elements at the beginning.
 * 3. Implement addLast() to insert elements at the end.
 * 4. Implement add(index, data) to insert at a specific position.
 * 5. Implement removeFirst() and removeLast() for deletion.
 * 6. Implement deleteNthFromEnd() to delete the nth node from the end.
 * 7. Implement print() to display the linked list.
 */

public class ll1 {

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

    public void addFirst(int data) {

        // create new node
        Node newNode = new Node(data);

        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - newNode next = head
        newNode.next = head;

        // step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);

        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // assign new node next to tail
        tail.next = newNode;

        // making last node tail
        tail = newNode;
    }

    // public void print() {
    // Node temp = head;
    // if (head == null) {
    // System.out.println("ll is empty");
    // return;
    // }
    // while (temp != null) {
    // System.out.print(temp.data + "->");
    // temp = temp.next;
    // }
    // System.out.println("null");
    // }

    public void print(String message) {
        System.out.println(message);

        Node temp = head;
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public void add(int idx, int data) {

        if (idx < 0 || idx > size) {
            System.out.println("Invalid index");
            return;
        }

        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    public int removeFirst() {

        // for two special cases
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {

        // for two special cases
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            // int val = head.data;
            int val = tail.data;
            size = 0;
            head = tail = null;
            return val;
        }

        // prev: i = size -2;
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void deleteNthfromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;

            if (n == sz) {
                head = head.next; // remove first
                return;
            }

            // sz - n
            int i = 1;
            int iToFind = sz - n;
            Node prev = head;
            while (i < iToFind) {
                prev = prev.next;
                i++;
            }

            prev.next = prev.next.next;
            return;
        }
    }

    public static void main(String[] args) {
        ll1 ll = new ll1();

        ll.addFirst(89);
        ll.addFirst(88);
        ll.addFirst(87);
        ll.addFirst(86);

        System.out.println();
        ll.print("After adding elements at first:");

        ll.addLast(88);
        ll.addLast(87);
        ll.addLast(86);
        ll.addLast(85);

        ll.print("After adding elements at last:");

        ll.add(0, 85);
        ll.add(5, 90);
        ll.add(6, 89);

        ll.print("After adding elements at specific index:");

        ll.removeFirst();
        ll.print("After removing first element:");

        // ll.print();

        ll.removeLast();
        ll.print("After removing last element:");

        // ll.print();

        // ll.deleteNthfromEnd();
        ll.deleteNthfromEnd(1);
        ll.print("After deleting nth node from end:");

        // ll.print();
    }
}
