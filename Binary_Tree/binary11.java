// Construct tree from preorder and inorder traversals
public class binary11 {

    static class Node {
        int data;
        Node left, right;

        Node(int x) {
            data = x;
            left = right = null;
        }
    }

    public static Node constructBinaryTreeUtil(int[] pre,
                                               int[] preMirror,
                                               int[] preIndex,
                                               int l,
                                               int h,
                                               int n) {

        if (preIndex[0] >= n || l > h)
            return null;

        Node root = new Node(pre[preIndex[0]++]);

        // Leaf node
        if (l == h)
            return root;

        int i;
        for (i = l; i <= h; i++) {
            if (preIndex[0] < n &&
                    pre[preIndex[0]] == preMirror[i]) {
                break;
            }
        }

        // Construct left and right subtrees
        if (i <= h) {
            root.left = constructBinaryTreeUtil(
                    pre, preMirror, preIndex, i, h, n);

            root.right = constructBinaryTreeUtil(
                    pre, preMirror, preIndex, l + 1, i - 1, n);
        }

        return root;
    }

    public static Node constructBinaryTree(int[] pre,
                                           int[] preMirror) {

        int n = pre.length;
        int[] preIndex = {0};

        return constructBinaryTreeUtil(
                pre, preMirror, preIndex, 0, n - 1, n);
    }

    public static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {

        int[] pre = {1, 2, 4, 5, 3, 6, 7};
        int[] preMirror = {1, 3, 7, 6, 2, 5, 4};

        Node root = constructBinaryTree(pre, preMirror);

        printInorder(root);
    }
}
