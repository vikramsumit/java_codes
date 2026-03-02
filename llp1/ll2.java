public class ll2 {
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

    public int itrSearch(int key) { // O(n) - linear time
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // if key not found
        return -1;

    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() { // 0(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

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

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 - find mid
        Node midNode = findMid(head);

        // step 2 - reverse 2ns half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step3 - check right half and left half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main(String[] args) {

        ll2 ll = new ll2();

        ll.addFirst(869);
        ll.addFirst(788);
        ll.addFirst(587);
        ll.addFirst(866);
        ll.addFirst(865);
        ll.addFirst(86);
        ll.addFirst(126);
        ll.addFirst(456);
        ll.addFirst(8622);

        ll.print("After adding elements at first:");

        int index = ll.itrSearch(126);

        if (index == -1) {
            System.out.println("Iterative Search: Key not found");
        } else {
            System.out.println("Iterative Search: Key found at index = " + index);
        }

        int recIndex = ll.recSearch(231);

        if (recIndex == -1) {
            System.out.println("Recursive Search: Key not found");
        } else {
            System.out.println("Recursive Search: Key found at index = " + recIndex);
        }

        System.out.println("Is Palindrome: " + ll.checkPalindrome());
    }

}
