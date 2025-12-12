// two pointer approach arraylist should be sorted

import java.util.ArrayList;
import java.util.Collections;

public class pairsum1i {
    public static ArrayList<ArrayList<Integer>> pairsum1(ArrayList<Integer> list, int target) {
        ArrayList<ArrayList<Integer>> allPairs = new ArrayList<>();

        Collections.sort(list);

        // Initialize two pointers
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int sum = list.get(left) + list.get(right);

            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(list.get(left));
                pair.add(list.get(right));
                allPairs.add(pair);

                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return allPairs;  // Return the list of all pairs
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8);

        ArrayList<ArrayList<Integer>> result = pairsum1(list, 8);

        if (!result.isEmpty()) {
            System.out.println("Pairs found:");
            for (ArrayList<Integer> pair : result) {
                System.out.println(pair);
            }
        } else {
            System.out.println("No pairs found");
        }
    }
}

