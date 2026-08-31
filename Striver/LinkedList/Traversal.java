
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



class Traversal {

    private static Node convert2all(int[] arr){
    Node head= new Node(arr[0]);
    Node mover=head;
    for(int i=1;i<arr.length;i++){
        Node temp=new Node(arr[i]);
        mover.next=temp;
        mover=temp;
    }
    return head;

}
    
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 3 };
        Node head = convert2all(arr);
        System.out.print(head.data);

    }
}




// # Array → Linked List — Important Points

// 1. **Node structure**

//    * `data` stores the value.
//    * `next` stores the reference/address of the next node.
//    * Last node's `next` is `null`.

// 2. **Head**

//    ```java
//    Node head = new Node(arr[0]);
//    ```

//    * `head` always points to the first node.
//    * Do not move `head`, because it is the entry point to the entire linked list.

// 3. **Mover**

//    ```java
//    Node mover = head;
//    ```

//    * `mover` is used to move through the linked list and add new nodes.
//    * Unlike `head`, `mover` can be changed.

// 4. **Loop starts from index 1**

//    ```java
//    for(int i = 1; i < arr.length; i++)
//    ```

//    * The first element `arr[0]` is already used to create `head`.
//    * Therefore, start from `arr[1]`.

// 5. **Create a new node**

//    ```java
//    Node temp = new Node(arr[i]);
//    ```

//    * Creates a new node containing the current array element.

// 6. **Connect the new node**

//    ```java
//    mover.next = temp;
//    ```

//    * Connects the current last node to the newly created node.

// 7. **Move mover forward**

//    ```java
//    mover = temp;
//    ```

//    * Moves `mover` to the newly created node.
//    * Now `mover` becomes the last node.

// 8. **Most important pattern**

//    ```java
//    Node temp = new Node(arr[i]);  // Create
//    mover.next = temp;              // Connect
//    mover = temp;                   // Move
//    ```

//    Remember: **Create → Connect → Move**

// 9. **Return head**

//    ```java
//    return head;
//    ```

//    * Return `head`, not `mover`.
//    * `head` gives access to the complete linked list.

// 10. **Final structure**

//     ```text
//     head
//      ↓
//     [2] → [4] → [5] → [3] → null
//                             ↑
//                           mover
//     ```

// ### ⭐ Core Logic to Remember

// **Head points to the first node. Mover is used to build/traverse the list. Create a new node, connect it using `mover.next`, then move `mover` to the new node. Finally, return `head`.**
