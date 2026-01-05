import java.util.Arrays;

/**
 * Merge Sort Implementation in Java.
 * Time Complexity: O(n log n) - worst, average, and best case
 * Space Complexity: O(n) - requires additional memory for merging
 * Stable: Yes
 */
public class mergesort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Merge Sort algorithm (Divide and Conquer).
     * Divides the array into halves, recursively sorts them, then merges.
     */
    public static void mergeSort(int[] a) {
        if (a.length < 2) return;
        mergeSortRec(a, 0, a.length - 1);
    }

    private static void mergeSortRec(int[] a, int l, int r) {
        if (l >= r) return;
        int m = l + (r - l) / 2;
        mergeSortRec(a, l, m);
        mergeSortRec(a, m + 1, r);
        merge(a, l, m, r);
    }

    private static void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int[] L = new int[n1];
        int[] R = new int[n2];
        System.arraycopy(a, l, L, 0, n1);
        System.arraycopy(a, m + 1, R, 0, n2);
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) a[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) a[k++] = L[i++];
        while (j < n2) a[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        mergeSort(arr);
        print("MergeSort", arr);
    }
}

