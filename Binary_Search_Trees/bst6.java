// Diagram of Original BST (before mirroring):
//           8
//          / \
//         5   10
//        / \    \
//       3   6    11
//
// Diagram of Mirrored BST (after mirroring):
//           8
//          / \
//         10  5
//        /   / \
//       11  6   3

public class bst6 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }

    }
    
    public static Node createMirror(Node root){
        if (root == null) {
            return null;
        }

        Node leftMirrorimg = createMirror(root.left);
        Node rightMirrorimg = createMirror(root.right);

        root.left = rightMirrorimg;
        root.right = leftMirrorimg;

        return root;
     }

     public static void preorder(Node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
     } 


    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        
        root = createMirror(root);
        preorder(root);
        
    }
}
