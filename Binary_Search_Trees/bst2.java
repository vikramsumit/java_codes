public class bst2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert a new value into the BST
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        // If data == root.data, do nothing (no duplicates)

        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        } else if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7, 88};
        Node root = null;

        // Build the BST
        for (int val : values) {
            root = insert(root, val);
        }

        // Search for 4
        if (search(root, 4)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        // Optional: Test another search
        if (search(root, 88)) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }
    }
}