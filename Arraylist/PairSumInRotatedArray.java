import java.util.ArrayList;
import java.util.Collections;

public class PairSumInRotatedArray {
    // Method to find pairs that sum up to the target value in a sorted and rotated array
    public static ArrayList<ArrayList<Integer>> pairsum1(ArrayList<Integer> list, int target) {
        ArrayList<ArrayList<Integer>> allPairs = new ArrayList<>();

        int n = list.size();
        
        // Find the pivot point
        int pivot = findPivot(list, n);
        
        // Set the left and right pointers
        int left = (pivot + 1) % n; // Index of the smallest element
        int right = pivot;          // Index of the largest element

        // Using the two-pointer technique
        while (left != right) {
            int sum = list.get(left) + list.get(right);

            // Check if the current sum is equal to the target
            if (sum == target) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(list.get(left));
                pair.add(list.get(right));
                allPairs.add(pair);

                // Move left pointer to the right
                left = (left + 1) % n;

                // Move right pointer to the left
                right = (right - 1 + n) % n;

                // If pointers meet, stop
                if (left == right) {
                    break;
                }
            } else if (sum < target) {
                // If the sum is less than the target, move the left pointer to the right
                left = (left + 1) % n;
            } else {
                // If the sum is greater than the target, move the right pointer to the left
                right = (right - 1 + n) % n;
            }
        }

        return allPairs;  // Return the list of all pairs
    }

    // Method to find the pivot point in a rotated sorted array
    public static int findPivot(ArrayList<Integer> list, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return i;
            }
        }
        return n - 1;  // If no pivot, the array is not rotated
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11, 15, 6, 8, 9, 10);

        ArrayList<ArrayList<Integer>> result = pairsum1(list, 16);

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
