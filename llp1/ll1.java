

public class ll1 {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
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

    public void addLast(int data){

        Node newNode = new Node(data);

        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        // assign new node next to tail
        tail.next = newNode;

        // making last node tail
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

    public static void main(String[] args){
        ll1 ll =new ll1();

        ll.addFirst(89);
        ll.addFirst(88);
        ll.addFirst(87);
        ll.addFirst(86);

        ll.print();

        ll.addLast(88);
        ll.addLast(87);
        ll.addLast(86);
        ll.addLast(85);

        ll.print();
    }
}
