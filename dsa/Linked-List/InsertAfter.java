class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class InsertAfter {

    public static void insertAfter(Node current, int trackId) {

        if (current == null)
            return;

        Node newNode = new Node(trackId);

        newNode.next = current.next;

        current.next = newNode;
    }

    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(40);

        System.out.println("Before Insertion:");
        display(head);

        insertAfter(head.next, 30);

        System.out.println("After Insertion:");
        display(head);
    }
}
