package Deletion;
class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }

}

public class DeleteKthElement {

    // Convert array to Linked List
    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    // Function to delete head
    private static Node deleteK(Node head, int index) {

        Node temp = head;
        Node curr = null;
        int count = 1;
        if (head == null) {
            return head;
        }
        if (index <= 0) {
            return head;
        }
        if (index == 1) {
            head = head.next;
            return head;
        }

        while (temp != null) {

            if (count == index) {
                curr.next = temp.next;
                break;
            }
            count++;
            curr = temp;
            temp = temp.next;
        }
        return head;
    }

    // Function to print Linked List
    private static void printLL(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        int[] arr = {2,4,5,6};

        Node head = convertArr2LL(arr);
        int index = 3;

        head = deleteK(head, index);

        printLL(head);
    }

}
