import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class IterativePreorderTraversal {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static List<Integer> iterativePreorder(Node root) {

        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node node = stack.pop();
            result.add(node.val);

            if (node.right != null)
                stack.push(node.right);

            if (node.left != null)
                stack.push(node.left);
        }

        return result;
    }
}
