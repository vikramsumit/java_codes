// Union and Intersection

import java.util.HashSet;

public class problem2 {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        // UNION
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        System.out.println("Union = " + set.size());
        System.out.println(set);

        // INTERSECTION
        set.clear();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        HashSet<Integer> intersection = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                intersection.add(arr2[i]);
                set.remove(arr2[i]); // avoids counting duplicates
            }
        }

        System.out.println("Intersection = " + count);
        System.out.println(intersection);
    }
}