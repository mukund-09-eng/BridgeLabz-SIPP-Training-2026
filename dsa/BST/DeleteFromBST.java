public class DeleteFromBST {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node delete(Node node, int key) {

        if (node == null)
            return null;

        if (key < node.val) {

            node.left = delete(node.left, key);

        } else if (key > node.val) {

            node.right = delete(node.right, key);

        } else {

            if (node.left == null && node.right == null)
                return null;

            if (node.left == null)
                return node.right;

            if (node.right == null)
                return node.left;

            Node successor = findMin(node.right);

            node.val = successor.val;

            node.right = delete(node.right, successor.val);
        }

        return node;
    }

    private static Node findMin(Node node) {

        while (node.left != null) {
            node = node.left;
        }

        return node;
    }
}
