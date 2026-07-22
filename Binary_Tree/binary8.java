// kth level of a tree

public class binary8 {
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

    // public static void kthLevel(Node root, int k) {
    //     if (root == null) {
    //         return;
    //     }

    //     if (k == 1) {
    //         System.out.print(root.data + " ");
    //         return;
    //     }

    //     kthLevel(root.left, k - 1);
    //     kthLevel(root.right, k - 1);
    // }

    public static void kthLevel(Node root, int level, int k){
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data + " ");
            return;
        }

        kthLevel(root.left, level + 1 , k);
        kthLevel(root.right, level+1, k);
    }
    public static void main(String[] args) {
        
        /*
        
                1
               / \
              2   3
             / \ / \
            4  5 6  7
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // kthLevel(root, 3);

        int k = 3;
        kthLevel(root, 1, k);
    }
}
