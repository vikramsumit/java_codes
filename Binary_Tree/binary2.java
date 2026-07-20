//Count of nodes in Binary Tree

// import org.w3c.dom.Node;


public class binary2 {
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

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    public static void main(String[] args) {

    /*
              1       
            /   \
           2     3
          / \   / \
         4   5 6   7
   */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        // root.right.left = new Node(6);
        root.right.right = new Node(6);
        // root.left.left.left = new Node(8);

        System.out.println("Count of nodes in the binary tree: " + countNodes(root));

    }
    
}
