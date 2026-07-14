class Node {

    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeLogStreams {

    public static Node mergeLogStreams(Node a, Node b) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.val <= b.val) {

                tail.next = a;
                a = a.next;

            } else {

                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a != null)
            tail.next = a;
        else
            tail.next = b;

        return dummy.next;
    }

    public static void display(Node head) {

        while (head != null) {

            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);
        list1.next.next.next = new Node(7);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);
        list2.next.next.next = new Node(8);

        System.out.println("First Sorted List:");
        display(list1);

        System.out.println("Second Sorted List:");
        display(list2);

        Node merged = mergeLogStreams(list1, list2);

        System.out.println("Merged Sorted List:");
        display(merged);
    }
}
