import java.util.Arrays;

/**
 * Comb Sort Implementation in Java.
 * Time Complexity: O(n²) - worst case, O(n log n) - best case
 * Space Complexity: O(1) - in-place sorting
 * Stable: No
 */
public class combsort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Comb Sort algorithm.
     * An improvement over bubble sort by comparing elements that are
     * far apart (with a "gap") and gradually reducing the gap.
     * The shrink factor is typically 1.3.
     */
    public static void combSort(int[] a) {
        int n = a.length;
        double shrink = 1.3;
        int gap = n;
        boolean sorted = false;
        while (!sorted) {
            gap = (int)(gap / shrink);
            if (gap <= 1) { gap = 1; sorted = true; }
            int i = 0;
            while (i + gap < n) {
                if (a[i] > a[i + gap]) {
                    swap(a, i, i + gap);
                    sorted = false;
                }
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        combSort(arr);
        print("CombSort", arr);
    }
}

