import java.util.*;

public class heap1 {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); //Less Value HIgh priority

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //Highest the number Highest the priority

        pq.add(420); //O(logn)
        pq.add(120);
        pq.add(69);
        pq.add(5);
        pq.add(96);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); //O(logn)
        }
    }
}

//Comparator.reverseOrder
