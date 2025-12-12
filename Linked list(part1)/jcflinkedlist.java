import java.util.LinkedList; // JCF optimized best time complexity

public class jcflinkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(2);
        ll.addLast(1);
        ll.addFirst(0);
        ll.addFirst(6);
        ll.addFirst(5);
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        ll.removeAll(ll);
        System.out.println(ll);

        //remove
    }
}
