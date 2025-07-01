package ds;

public class BinaryTreeMain {
    static class Node {
        // value of the node
        int data;
        // reference of left child
        Node left;
        // reference of right child
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args) {
        /*
                    1
                  /   \
                 2     3
               /  \
              4    5
         */
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }
}
