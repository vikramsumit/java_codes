import java.util.Arrays;

/**
 * Heap Sort Implementation in Java.
 * Time Complexity: O(n log n) - worst, average, and best case
 * Space Complexity: O(1) - in-place sorting
 * Stable: No
 */
public class heapsort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Heap Sort algorithm.
     * Converts the array into a max heap, then repeatedly
     * extracts the maximum element and rebuilds the heap.
     */
    public static void heapSort(int[] a) {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(a, n, i);
        for (int i = n - 1; i > 0; i--) {
            swap(a, 0, i);
            heapify(a, i, 0);
        }
    }

    private static void heapify(int[] a, int heapSize, int root) {
        int largest = root;
        int l = 2 * root + 1;
        int r = 2 * root + 2;
        if (l < heapSize && a[l] > a[largest]) largest = l;
        if (r < heapSize && a[r] > a[largest]) largest = r;
        if (largest != root) {
            swap(a, root, largest);
            heapify(a, heapSize, largest);
        }
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        heapSort(arr);
        print("HeapSort", arr);
    }
}

