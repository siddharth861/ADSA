

class BinaryTree {


    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }


    Node root;


    BinaryTree() {
        root = null;
    }


    void preOrder(Node node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }


    void inOrder(Node node) {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }


    void postOrder(Node node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();


        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);


        System.out.println("Preorder traversal:");
        tree.preOrder(tree.root);  // Output: 1 2 4 5 3 6

        System.out.println("\nInorder traversal:");
        tree.inOrder(tree.root);   // Output: 4 2 5 1 3 6

        System.out.println("\nPostorder traversal:");
        tree.postOrder(tree.root); // Output: 4 5 2 6 3 1
    }
}
