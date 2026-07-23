//in classes

import java.util.Comparator;
import java.util.PriorityQueue;

public class heap2 {
    static class student implements Comparable<student>{
        String name;
        int rank;

        public student (String name, int rank){
            this.name = name;
            this.rank = rank; 
        }

        @Override
        public int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<student> pq = new PriorityQueue<>();
        PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new student("A", 65));
        pq.add(new student("B", 52));
        pq.add(new student("C", 88));
        pq.add(new student("D", 23));
        pq.add(new student("F", 96));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
        
    }
}
