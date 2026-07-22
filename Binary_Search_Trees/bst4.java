public class bst4 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Helper to insert nodes (needed to build the tree for testing)
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Print all nodes in the range [k1, k2]
    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }

        // If current node is within range, print it and check both subtrees
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        // If current node is smaller than k1, the range must be in the right subtree
        else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        }
        // If current node is larger than k2, the range must be in the left subtree
        else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void main(String[] args) {
        // Build a sample BST
        int[] values = {5, 1, 3, 4, 2, 7, 88, 10, 6, 9};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        // Example 1: Range [3, 8]
        int k1 = 3;
        int k2 = 8;
        System.out.print("Nodes in range [" + k1 + ", " + k2 + "]: ");
        printInRange(root, k1, k2);
        System.out.println();

        // Example 2: Range [1, 5]
        k1 = 1;
        k2 = 5;
        System.out.print("Nodes in range [" + k1 + ", " + k2 + "]: ");
        printInRange(root, k1, k2);
        System.out.println();
    }
}