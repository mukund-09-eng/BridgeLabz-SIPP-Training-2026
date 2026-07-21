public class CategoryTreeHeight {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static int height(Node node) {

        if (node == null)
            return -1;

        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }
}
