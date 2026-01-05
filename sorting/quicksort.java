import java.util.Arrays;

/**
 * Quick Sort Implementation in Java (Lomuto partition scheme).
 * Time Complexity: O(n²) - worst case, O(n log n) - average case
 * Space Complexity: O(log n) - due to recursion stack
 * Stable: No (may swap equal elements)
 */
public class quicksort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Quick Sort algorithm (Divide and Conquer).
     * Selects a pivot element and partitions the array around it.
     */
    public static void quickSort(int[] a) {
        quickSortRec(a, 0, a.length - 1);
    }

    private static void quickSortRec(int[] a, int low, int high) {
        if (low >= high) return;
        int p = partition(a, low, high);
        quickSortRec(a, low, p - 1);
        quickSortRec(a, p + 1, high);
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, high);
        return i;
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        quickSort(arr);
        print("QuickSort", arr);
    }
}

