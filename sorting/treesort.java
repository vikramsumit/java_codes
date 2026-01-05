import java.util.Arrays;

/**
 * Tree Sort Implementation in Java.
 * Time Complexity: O(n²) - worst case (unbalanced tree), O(n log n) - average case
 * Space Complexity: O(n) - requires storage for tree nodes
 * Stable: Yes
 */
public class treesort {

    private static void print(String title, int[] a) {
        System.out.println(title + Arrays.toString(a));
    }

    /**
     * Tree Sort algorithm.
     * Builds a Binary Search Tree (BST) from the elements and
     * performs inorder traversal to get sorted order.
     */
    public static void treeSort(int[] a) {
        if (a.length == 0) return;
        Node root = null;
        for (int v : a) root = bstInsert(root, v);
        // Inorder traversal to overwrite array
        int[] idx = {0};
        inorderFill(root, a, idx);
    }

    private static class Node {
        int val;
        Node left, right;
        Node(int v) { val = v; }
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

    public static void main(String[] args) {
        int[] base = {38, 27, 43, 3, 9, 82, 10, 27};
        int[] arr = Arrays.copyOf(base, base.length);
        
        print("Original", arr);
        treeSort(arr);
        print("TreeSort", arr);
    }
}

