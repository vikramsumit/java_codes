/*
 * Java Collection Framework Linked List Implementation Steps:

 * 1. Use java.util.LinkedList for built-in linked list implementation.
 * 2. Learn various methods provided by LinkedList class.
 * 3. Implement addFirst(), addLast(), add(), removeFirst(), removeLast().
 * 4. Implement contains(), indexOf(), size() methods.
 * 5. Understand difference between ArrayList and LinkedList.
 */

import java.util.LinkedList;

public class jcfll {
    // This class demonstrates Java Collection Framework's LinkedList implementation
    // You can use the built-in java.util.LinkedList class for various operations

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(0);

        System.out.println(ll);
        
        ll.removeFirst();
        ll.removeLast();
        
        System.out.println(ll);

    }
    
}
