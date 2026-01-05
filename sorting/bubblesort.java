import java.util.Arrays;

/**
 * Bubble Sort Implementation in Java.
 * Time Complexity: O(n²) - worst and average case
 * Space Complexity: O(1) - in-place sorting
 * Stable: Yes
 */
public class bubblesort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Bubble Sort algorithm.
     * Repeatedly steps through the list, compares adjacent elements,
     * and swaps them if they are in the wrong order.
     */
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) return;
        }
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        bubbleSort(arr);
        print("BubbleSort", arr);
    }
}

