import java.util.Arrays;

/**
 * Bitonic Sort Implementation in Java.
 * Time Complexity: O(log² n) - requires length to be power of two
 * Space Complexity: O(log n) - due to recursion
 * Stable: No
 * 
 * Bitonic Sort is a comparison-based sorting algorithm that is particularly
 * efficient for parallel processing. It creates a bitonic sequence and then
 * converts it into a sorted sequence.
 * 
 * Note: Array length must be a power of two.
 */
public class bitonicsort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Bitonic Sort algorithm.
     * Requires array length to be a power of two.
     * 
     * @param a the array to sort
     * @param ascending if true, sort in ascending order; otherwise descending
     * @throws IllegalArgumentException if array length is not a power of two
     */
    public static void bitonicSort(int[] a, boolean ascending) {
        int n = a.length;
        if ((n & (n - 1)) != 0) throw new IllegalArgumentException("Bitonic sort requires length = power of two.");
        bitonicSortRec(a, 0, n, ascending);
    }

    private static void bitonicSortRec(int[] a, int lo, int cnt, boolean dir) {
        if (cnt <= 1) return;
        int k = cnt / 2;
        bitonicSortRec(a, lo, k, true);
        bitonicSortRec(a, lo + k, k, false);
        bitonicMerge(a, lo, cnt, dir);
    }

    private static void bitonicMerge(int[] a, int lo, int cnt, boolean dir) {
        if (cnt <= 1) return;
        int k = cnt / 2;
        for (int i = lo; i < lo + k; i++) {
            if ((a[i] > a[i + k]) == dir) swap(a, i, i + k);
        }
        bitonicMerge(a, lo, k, dir);
        bitonicMerge(a, lo + k, k, dir);
    }

    public static void main(String[] args) {
        // Bitonic sort requires size power of two
        int[] base = {10, 30, 11, 20, 4, 33, 2, 1}; // length 8
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        bitonicSort(arr, true);
        print("BitonicSort (ascending) on 8 elements", arr);
    }
}

