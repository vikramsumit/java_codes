// public class linkedlist2 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         if (head == null) {
//             System.out.println("ll is empty");
//             System.out.println("rom rom bhaiyo system khali hai ");
//             return;
//         }
//         while (temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public void deleteNthfromEnd(int n) {
//         if (n > size || n <= 0) {
//             System.out.println("Invalid value of n");
//             return;
//         }

//         if (n == size) {
//             head = head.next;
//             size--;
//             return;
//         }

//         int iToFind = size - n;
//         Node prev = head;
//         for (int i = 1; i < iToFind; i++) {
//             prev = prev.next;
//         }

//         prev.next = prev.next.next;
//         size--;
//     }

//     public static void main(String[] args) {
//         linkedlist2 ll = new linkedlist2();

//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);

//         ll.print();

//         ll.deleteNthfromEnd(4);
//         ll.print();
//     }
// }

public class linkedlist2 {
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
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("ll is empty");
            System.out.println("rom rom bhaiyo system khali hai ");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void deleteNthfromEnd(int n) {
        if (n > size || n <= 0) {
            System.out.println("Invalid value of n");
            return;
        }

        if (n == size) {
            head = head.next;
            size--;
            return;
        }

        int iToFind = size - n;
        Node prev = head;
        for (int i = 1; i < iToFind; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        size--;
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        if (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
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
        if (head == null || head.next == null) {
            return head;
        }
        // find mid
        Node mid = getMid(head);
        // left and right merge sort
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);
        // merge
        return merge(newLeft, newRight);
    }

    public void zigZag() {
        // find mid
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        
        //zig zag merging
        while(left!= null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;
            
            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
        linkedlist2 ll = new linkedlist2();

        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(52);

        ll.print(); // Expected: 1->2->3->4->5->null

        ll.head = ll.mergeSort(ll.head);
        ll.print();

        ll.zigZag();
        ll.print();

        

        // ll.deleteNthfromEnd(3); // Remove 3rd from end, which is '3'
        // ll.print(); // Expected: 1->2->4->5->null
    }
}
