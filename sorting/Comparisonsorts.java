import java.util.Arrays;

/**
 * Collection of common comparison-based sorting algorithms in Java.
 * Each algorithm is implemented as a static method that sorts the input array in-place.
 *
 * Usage: Call each method with an int[] (a copy if you want to preserve the original).
 */
public class Comparisonsorts {

    /* -------------------- Helpers -------------------- */

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a)+ "\n");
    }

    /* -------------------- Simple O(n^2) sorts -------------------- */

    // 1. Bubble Sort
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) return;
        }
    }

    // 2. Selection Sort
    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[minIdx]) minIdx = j;
            swap(a, i, minIdx);
        }
    }

    // 3. Insertion Sort
    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // 4. Gnome Sort
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

    // 5. Cocktail Sort (bidirectional bubble)
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

    // 6. Comb Sort
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

    // 7. Cycle Sort (minimizes writes; stable handling of duplicates)
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

    /* -------------------- Divide & Conquer / n log n sorts -------------------- */

    // 8. Merge Sort
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

    // 9. Quick Sort (Lomuto partition)
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

    // 10. Heap Sort
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

    // 11. Shell Sort
    public static void shellSort(int[] a) {
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = a[i];
                int j = i;
                while (j >= gap && a[j - gap] > temp) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = temp;
            }
        }
    }

    // 12. Tree Sort (using BST; unbalanced)
    private static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
    }

    public static void treeSort(int[] a) {
        if (a.length == 0) return;
        Node root = null;
        for (int v : a) root = bstInsert(root, v);
        // Inorder traversal to overwrite array
        int[] idx = {0};
        inorderFill(root, a, idx);
    }

    private static Node bstInsert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val <= root.val) root.left = bstInsert(root.left, val);
        else root.right = bstInsert(root.right, val);
        return root;
    }

    private static void inorderFill(Node node, int[] a, int[] idx) {
        if (node == null) return;
        inorderFill(node.left, a, idx);
        a[idx[0]++] = node.val;
        inorderFill(node.right, a, idx);
    }

    /* -------------------- TimSort (simplified educational version) -------------------- */

    // 13. TimSort (simplified: create runs using insertion sort and merge)
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

    /* -------------------- Parallel / network style sort -------------------- */

    // 14. Bitonic Sort (requires length to be power of two)
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

    /* -------------------- Main: Demonstration -------------------- */

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27,42,234,234,45,3543,345,3452};

        // For each algorithm, operate on a copy of base
        int[] arr;

        arr = Arrays.copyOf(base, base.length);
        print("Original", arr);
        arr = Arrays.copyOf(base, base.length); bubbleSort(arr); print("BubbleSort", arr);

        arr = Arrays.copyOf(base, base.length); selectionSort(arr); print("SelectionSort", arr);
        arr = Arrays.copyOf(base, base.length); insertionSort(arr); print("InsertionSort", arr);
        arr = Arrays.copyOf(base, base.length); gnomeSort(arr); print("GnomeSort", arr);
        arr = Arrays.copyOf(base, base.length); cocktailSort(arr); print("CocktailSort", arr);
        arr = Arrays.copyOf(base, base.length); combSort(arr); print("CombSort", arr);
        arr = Arrays.copyOf(base, base.length); cycleSort(arr); print("CycleSort", arr);

        arr = Arrays.copyOf(base, base.length); mergeSort(arr); print("MergeSort", arr);
        arr = Arrays.copyOf(base, base.length); quickSort(arr); print("QuickSort", arr);
        arr = Arrays.copyOf(base, base.length); heapSort(arr); print("HeapSort", arr);
        arr = Arrays.copyOf(base, base.length); shellSort(arr); print("ShellSort", arr);
        arr = Arrays.copyOf(base, base.length); treeSort(arr); print("TreeSort", arr);
        arr = Arrays.copyOf(base, base.length); timSort(arr); print("TimSort(simplified)", arr);

        // Bitonic demo: requires size power of two
        int[] powerOfTwo = {10, 30, 11, 20, 4, 33, 2, 1}; // length 8
        arr = Arrays.copyOf(powerOfTwo, powerOfTwo.length);
        bitonicSort(arr, true);
        print("BitonicSort(asc) on 8 elements", arr);
    }
}
