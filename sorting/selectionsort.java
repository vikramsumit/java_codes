import java.util.Arrays;

/**
 * Selection Sort Implementation in Java.
 * Time Complexity: O(n²) - worst, average, and best case
 * Space Complexity: O(1) - in-place sorting
 * Stable: No (may swap equal elements)
 */
public class selectionsort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Selection Sort algorithm.
     * Divides the list into a sorted and unsorted region.
     * Repeatedly selects the smallest element from the unsorted region
     * and moves it to the sorted region.
     */
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[minIdx]) minIdx = j;
            swap(a, i, minIdx);
        }
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        selectionSort(arr);
        print("SelectionSort", arr);
    }
}

