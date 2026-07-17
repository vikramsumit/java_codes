//Implimentation of Queue using JCF

import java.util.*;

public class queue4 {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new PriorityQueue<>();
        Queue<Integer> q = new ArrayDeque<>();
         
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(75);
        q.add(57);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

//Queue is an interface in Java Collection Framework. It is a data structure which follows FIFO(First In First Out) order. The element which is added first will be removed first. It is used when we want to process the elements in the same order as they are added. The Queue interface is present in java.util package and extends Collection interface. It has several implementations like LinkedList, PriorityQueue, ArrayDeque, etc.

//PRIORITY QUEUE: 
// PriorityQueue is a class in Java Collection Framework which implements Queue interface. It is used when we want to process the elements based on their priority. The element with the highest priority will be removed first. By default, the elements are ordered according to their natural ordering (for example, for integers, the smallest number has the highest priority). We can also provide a custom comparator to define our own ordering.

// Time Complexity of Queue operations using JCF:
// 1. add() - O(1) for LinkedList and ArrayDeque, O(log n) for PriorityQueue
// 2. remove() - O(1) for LinkedList and ArrayDeque, O(log n) for PriorityQueue
// 3. peek() - O(1) for LinkedList and ArrayDeque, O(1) for PriorityQueue