import java.util.Arrays;

/**
 * Tim Sort Implementation in Java (Simplified educational version).
 * Time Complexity: O(n log n) - worst and average case, O(n) - best case
 * Space Complexity: O(n) - requires additional memory for merges
 * Stable: Yes
 * 
 * TimSort is a hybrid sorting algorithm derived from merge sort and insertion sort.
 * It is the standard sorting algorithm used in Python, Java (since JDK 7), and Android.
 */
public class timsort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Tim Sort algorithm (simplified version).
     * Identifies natural runs in the data and extends them using insertion sort,
     * then merges the runs using merge sort.
     */
    public static void timSort(int[] a) {
        int n = a.length;
        int minRun = minRunLength(n);
        for (int start = 0; start < n; start += minRun) {
            int end = Math.min(start + minRun - 1, n - 1);
            insertionSortRange(a, start, end);
        }
        for (int size = minRun; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = Math.min(n - 1, left + size - 1);
                int right = Math.min((left + 2 * size - 1), n - 1);
                if (mid < right) merge(a, left, mid, right);
            }
        }
    }

    private static int minRunLength(int n) {
        int r = 0;
        while (n >= 64) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    private static void insertionSortRange(int[] a, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= left && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
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
        timSort(arr);
        print("TimSort (simplified)", arr);
    }
}

