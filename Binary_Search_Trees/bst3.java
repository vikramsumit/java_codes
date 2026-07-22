//Delete a NOde

public class bst3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // --- INSERTION ---
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        // If data == root.data, we ignore duplicates

        return root;
    }

    // --- SEARCH ---
    public static boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;
        else if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    // --- DELETE ---
    public static Node delete(Node root, int key) {
        if (root == null) return null;

        // Traverse to find the node
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Node found: Case 1, 2, or 3

            // Case 1: Node with no children (leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Node with one child
            if (root.left == null) {
                return root.right; // Replace with right child
            } else if (root.right == null) {
                return root.left; // Replace with left child
            }

            // Case 3: Node with two children
            // Find the Inorder Successor (smallest in the right subtree)
            root.data = minValue(root.right);
            // Delete the successor
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    // Helper: Find the minimum value in a subtree (leftmost node)
    public static int minValue(Node root) {
        int minVal = root.data;
        while (root.left != null) {
            root = root.left;
            minVal = root.data;
        }
        return minVal;
    }

    // --- TRAVERSAL (Inorder) ---
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7, 88};
        Node root = null;

        // Build the BST
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Original Tree: ");
        inorder(root);
        System.out.println();

        // Search Test
        if (search(root, 4)) {
            System.out.println("Found 4");
        } else {
            System.out.println("Not found 4");
        }

        // Delete Test: Deleting a leaf (2)
        System.out.println("\nDeleting 2 (Leaf Node)...");
        root = delete(root, 2);
        System.out.print("Tree after deleting 2: ");
        inorder(root);
        System.out.println();

        // Delete Test: Deleting a node with one child (1)
        System.out.println("\nDeleting 1 (One Child)...");
        root = delete(root, 1);
        System.out.print("Tree after deleting 1: ");
        inorder(root);
        System.out.println();

        // Delete Test: Deleting a node with two children (5 - root)
        System.out.println("\nDeleting 5 (Two Children)...");
        root = delete(root, 5);
        System.out.print("Tree after deleting 5: ");
        inorder(root);
        System.out.println();
    }
}