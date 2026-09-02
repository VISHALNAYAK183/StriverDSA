
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

public class InsertBeforeX {

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

  
    private static Node insertBeforeX(Node head, int x,int element) {
       Node temp=head;
        while(temp!=null){
            if(temp.next.data==x){
                Node newNode=new Node(element);
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }
            temp=temp.next;
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
        int x = 5;
        int element=10;

        head = insertBeforeX(head, x,element);

        printLL(head);
    }

}
