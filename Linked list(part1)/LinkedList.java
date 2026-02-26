public class LinkedList {
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
        // create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // assign new node next to tail
        tail.next = newNode;

        // makking last node tail
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1 ; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
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

    //slow fast approach
    public Node findMid(Node head) { //helper function for palindrome check
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }

        return slow; //slow is my middle
    }

    public boolean checkPalindrome(){
        if (head == null || head.next == null) {
            return true;
        }

        // step 1 - find mid
        Node midNode = findMid(head);

        //step 2 - reverse 2ns half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head;

        //step3 - check right half and left half
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
        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(1);

        ll.print();
        System.out.println(ll.checkPalindrome() );
        // ll.addLast(2);
        // ll.addFirst(9);
        // ll.addLast(3);
        // ll.addFirst(242);
        // ll.addLast(8);
        // ll.addLast(24);
        // ll.add(2, 420);
        // ll.add(0, 0);

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2, 3);

        // ll.print();

        // ll.deleteNthfromEnd(2);
        // ll.deleteNthfromEnd(5);
        // ll.print();

        // System.out.println("size of linked list are: " + ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println("size of linked list are: " + ll.size);

        // ll.removeLast();
        // ll.print();
        // System.out.println("size of linked list are: " + ll.size);

        // System.out.println(ll.itrSearch(420));
        // System.out.println(ll.itrSearch(242));
        // System.out.println(ll.itrSearch(536));

        // System.out.println(ll.recSearch(420));
        // System.out.println(ll.recSearch(242));
        // System.out.println(ll.recSearch(536));

        // ll.reverse();
        // ll.print();

        // ll.print();
        // ll.addFirst(2);
        // ll.print();
        // ll.addFirst(1);
        // ll.print();
        // ll.addLast(3);
        // ll.add(4,88);
        // ll.print();
        // ll.addLast(4);
        // ll.print();
        // ll.addLast(5);
        // ll.print();

        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
    }
}