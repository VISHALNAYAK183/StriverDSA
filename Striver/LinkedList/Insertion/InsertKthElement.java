
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

public class InsertKthElement {

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

  
    private static Node insertK(Node head, int index,int element) {
       
        if(head==null){
            if(index==1){
            return new Node(element);
            }else{
                return null;
            }
        }
         if(index==1){
                Node newNode=new Node(element);
                    newNode.next=head;
                    return newNode;
            }
             int count=0;
              Node temp=head;
            while(temp!=null){
                count++;
                if(count==index-1){
                        Node res=new Node(element);
                        res.next=temp.next;
                        temp.next=res;
                      
                        return head;
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
        int index = 3;
        int element=10;

        head = insertK(head, index,element);

        printLL(head);
    }

}
