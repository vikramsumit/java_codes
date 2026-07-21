// Diameter of Binary Tree

public class binary4 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // public static int height(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }

    //     int leftHeight = height(root.left);
    //     int rightHeight = height(root.right);

    //     return Math.max(leftHeight, rightHeight) + 1;
    // }

    // public static int diameter(Node root) {
    //     if (root == null) {
    //         return 0;
    //     }

    //     int leftHeight = height(root.left);
    //     int rightHeight = height(root.right);

    //     int leftDiameter = diameter(root.left);
    //     int rightDiameter = diameter(root.right);

    //     return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    // }

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static TreeInfo diameter(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftInfo = diameter(root.left);
        TreeInfo rightInfo = diameter(root.right);

        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        // At one time function can't compate three values, so we have to use Math.max() twice to compare three values.
        int diameter = Math.max(leftInfo.height + rightInfo.height + 1, Math.max(leftInfo.diameter, rightInfo.diameter));

        return new TreeInfo(height, diameter);
    }
    public static void main(String[] args) {

    /*
              1       
            /   \
           2     3
          / \   / \
         4   5 6   7
        / \
       8   9
   */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        // System.out.println("Diameter of the binary tree: " + diameter(root));

        System.out.println("Diameter of the binary tree: " + diameter(root).diameter);
        
    }
}

// Time Complexity: O(n^2) - In the worst case, we may have to traverse the entire tree for each node to calculate its height, leading to a time complexity of O(n^2).
// Space Complexity: O(h) - The space complexity is O(h), where h is the height of the binary tree. This is due to the recursive function calls that are stored in the call stack during the traversal of the tree. In the worst case, when the tree is skewed, the height can be equal to the number of nodes (n), resulting in a space complexity of O(n). In a balanced tree, the height would be log(n), leading to a space complexity of O(log n).

//For second approach, we can calculate the diameter and height in a single traversal of the tree, which reduces the time complexity to O(n). The space complexity remains O(h) due to the recursive function calls.