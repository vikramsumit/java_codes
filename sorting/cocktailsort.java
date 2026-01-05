import java.util.Arrays;

/**
 * Cocktail Sort Implementation in Java (Bidirectional Bubble Sort).
 * Time Complexity: O(n²) - worst and average case
 * Space Complexity: O(1) - in-place sorting
 * Stable: Yes
 */
public class cocktailsort {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Cocktail Sort algorithm (also known as bidirectional bubble sort).
     * Passes through the list from left to right, then right to left,
     * allowing smaller elements to move left faster and larger elements to move right faster.
     */
    public static void cocktailSort(int[] a) {
        boolean swapped = true;
        int start = 0;
        int end = a.length - 1;
        while (swapped) {
            swapped = false;
            for (int i = start; i < end; i++)
                if (a[i] > a[i + 1]) { swap(a, i, i + 1); swapped = true; }
            if (!swapped) break;
            swapped = false;
            end--;
            for (int i = end - 1; i >= start; i--)
                if (a[i] > a[i + 1]) { swap(a, i, i + 1); swapped = true; }
            start++;
        }
    }

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        cocktailSort(arr);
        print("CocktailSort", arr);
    }
}

