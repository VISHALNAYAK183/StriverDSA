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

public class DeletionOfHead {

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
private static Node deleteHead(Node head) {
    // Write your logic here
    Node temp=head;
    if(temp!=null){
        temp=temp.next;
    }
    return temp;
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

    int[] arr = {2, 4, 5, 3};

    Node head = convertArr2LL(arr);

    head = deleteHead(head);

    printLL(head);
}


}
