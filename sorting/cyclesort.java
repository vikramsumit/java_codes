import java.util.Arrays;

/**
 * Cycle Sort Implementation in Java.
 * Time Complexity: O(n²) - worst and average case
 * Space Complexity: O(1) - in-place sorting
 * Minimizes the number of writes to the array
 * Stable: Yes (handles duplicates properly)
 */
public class cyclesort {

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Cycle Sort algorithm.
     * A comparison-based sorting algorithm that places elements in their
     * correct position by cycling through the array.
     * Minimizes the number of memory writes (swaps).
     */
    public static void cycleSort(int[] a) {
        int n = a.length;
        for (int start = 0; start <= n - 2; start++) {
            int item = a[start];
            int pos = start;
            for (int i = start + 1; i < n; i++)
                if (a[i] < item) pos++;
            if (pos == start) continue;
            while (item == a[pos]) pos++;
            if (pos != start) {
                int temp = a[pos];
                a[pos] = item;
                item = temp;
            }
            while (pos != start) {
                pos = start;
                for (int i = start + 1; i < n; i++)
                    if (a[i] < item) pos++;
                while (item == a[pos]) pos++;
                if (item != a[pos]) {
                    int temp = a[pos];
                    a[pos] = item;
                    item = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        cycleSort(arr);
        print("CycleSort", arr);
    }
}

