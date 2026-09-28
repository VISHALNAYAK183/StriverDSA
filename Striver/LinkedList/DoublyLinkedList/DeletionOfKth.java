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
        if (arr.length == 0) {
            return null;
        }
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

public class DeletionOfKth {

    static Node deleteTail(Node head) {
        Node tail = head;
        if (head == null || head.next == null) {
            return null;
        }
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.back;
        tail.back = null;
        prev.next = null;

        return head;

    }

    static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    static Node deleteKth(Node head, int k) {

        int count = 1;
        Node temp = head;
        while (temp != null) {
            if (count == k) {
                break;
            }
            temp = temp.next;
            count++;
        }
        if (temp == null) {
            return head;
        }
        Node prev = temp.back;
        Node front = temp.next;
        if (prev == null && front == null) {
            return null;
        } else if (front == null) {
            head = deleteTail(head);

        } else if (prev == null) {
            head = deleteHead(head);
        } else {
            prev.next = front;
            front.back = prev;
            temp.next = null;
            temp.back = null;
            return head;
        }

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

        int[] arr = {  };

        int k = 2;

        Conversion con = new Conversion();

        Node head = con.convert2Dll(arr);

        System.out.print("Before deletion: ");
        print(head);

        head = deleteKth(head, k);

        System.out.print("After deletion:  ");
        print(head);
    }
}