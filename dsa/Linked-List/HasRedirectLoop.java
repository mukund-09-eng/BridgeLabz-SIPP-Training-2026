class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class HasRedirectLoop {

    public static boolean hasRedirectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Creating a cycle
        head.next.next.next.next = head.next;

        if (hasRedirectLoop(head))
            System.out.println("Cycle Detected!");
        else
            System.out.println("No Cycle Found.");
    }
}
