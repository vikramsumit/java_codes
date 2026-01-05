import java.util.Arrays;

/**
 * Gnome Sort Implementation in Java.
 * Time Complexity: O(n²) - worst case, O(n) - best case (already sorted)
 * Space Complexity: O(1) - in-place sorting
 * Stable: Yes
 */
public class gnomesort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Gnome Sort algorithm.
     * Similar to insertion sort but works by swapping adjacent elements.
     * Named after the Dutch garden gnome sorting flower pots.
     */
    public static void gnomeSort(int[] a) {
        int index = 0;
        int n = a.length;
        while (index < n) {
            if (index == 0 || a[index] >= a[index - 1]) index++;
            else {
                swap(a, index, index - 1);
                index--;
            }
        }
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        gnomeSort(arr);
        print("GnomeSort", arr);
    }
}

