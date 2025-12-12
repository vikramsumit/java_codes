import java.util.*;
// import java.util.ArrayList;
// import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(4);
        list.add(3);
        list.add(9);
        // list.add(5);

        System.out.println(list);
        Collections.sort(list); // sort in ascending order by default
        System.out.println("Sorted list are: " + list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        // comparator -  customize the sorting logic
        // Comparator<Integer> reverseAlphabets = (i1, i2) -> i2.compareTo(i1);
        // Collections.sort(list, reverseAlphabets);
        System.out.println("Sorted list are: " + list);

    }
}
