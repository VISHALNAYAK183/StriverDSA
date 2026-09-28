class Node {

    int data;
    Node next;
    Node back;

    Node(int data1, Node next1, Node back1) {
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
        this.back = null;
    }
}

class Conversion {

    Node convert2Dll(int[] arr) {

        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i], null, prev);

            prev.next = temp;
            prev = temp;
        }

        return head;
    }
}

public class DeletionOfTail {

    static Node deleteTail(Node head) {
        Node temp = head;
        if (head == null || head.next == null) {
            return null;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        Node prev = temp.back;
        temp.back = null;
        prev.next = null;

        return head;

    }

    private static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 2, 4, 5, 3 };

        Conversion con = new Conversion();

        Node head = con.convert2Dll(arr);

        System.out.print("Before deletion: ");
        print(head);

        head = deleteTail(head);

        System.out.print("After deletion:  ");
        print(head);
    }
}