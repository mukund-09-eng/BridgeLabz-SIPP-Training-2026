class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveTask {

    public static Node removeTask(Node head, int taskId) {

        if (head == null)
            return null;

        if (head.val == taskId)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.val != taskId) {

            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
    }

    static void display(Node head) {

        while (head != null) {

            System.out.print(head.val + " -> ");

            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Before Deletion:");
        display(head);

        head = removeTask(head, 3);

        System.out.println("After Deletion:");
        display(head);
    }
}
