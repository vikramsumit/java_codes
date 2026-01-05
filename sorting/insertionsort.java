import java.util.Arrays;

/**
 * Insertion Sort Implementation in Java.
 * Time Complexity: O(n²) - worst and average case, O(n) - best case (already sorted)
 * Space Complexity: O(1) - in-place sorting
 * Stable: Yes
 */
public class insertionsort {

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Insertion Sort algorithm.
     * Builds the sorted array one item at a time.
     * Efficient for small data sets and nearly sorted data.
     */
    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        insertionSort(arr);
        print("InsertionSort", arr);
    }
}

