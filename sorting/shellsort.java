import java.util.Arrays;

/**
 * Shell Sort Implementation in Java.
 * Time Complexity: O(n²) - worst case, O(n log n) - average case (depends on gap sequence)
 * Space Complexity: O(1) - in-place sorting
 * Stable: No
 */
public class shellsort {

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Shell Sort algorithm.
     * generalization of insertion sort that allows element exchanges
     * that are far apart. Uses diminishing increments (gap sequence).
     */
    public static void shellSort(int[] a) {
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = a[i];
                int j = i;
                while (j >= gap && a[j - gap] > temp) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        shellSort(arr);
        print("ShellSort", arr);
    }
}

