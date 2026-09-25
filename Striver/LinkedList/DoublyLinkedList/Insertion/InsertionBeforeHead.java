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


public class InsertionBeforeHead {

    static Node insertBeforeHead(Node head, int value) {
        Node newhead=new Node(value,head,null);
        // temp.next=head;
        // temp.back=null;
        head.back=newhead;

        return newhead;
    }


    private static void print(Node head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5};

        int value = 1;

        Conversion con = new Conversion();

        Node head = con.convert2Dll(arr);

        System.out.print("Before insertion: ");
        print(head);

        head = insertBeforeHead(head, value);

        System.out.print("After insertion:  ");
        print(head);
    }
}