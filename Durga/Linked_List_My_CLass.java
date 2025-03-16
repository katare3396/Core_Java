
public class Linked_List_My_CLass {

    Node head;
    int size;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    void println() {

        if (head == null) {
            System.out.println(" list is empty");
            return;
        }

        Node temp = head;
        System.out.println(" Displaying Node Element :-> ");

        while (temp != null) {
            System.out.print("    " + temp.data + "  -->>  ");
            temp = temp.next;
        }
        System.out.print(" NULL ");
    }

    // 01) Inserting the data first
    void addFirst(int data) {

        // [newNode] -> [3] -> NULL
        Node new_Node = new Node(data);

        if (head == null) {
            head = new_Node;
            return;
        }

        // [newNode] -> [3] -> [5] -> [10] -> [15] -> NULL
        new_Node.next = head;

        // Update head to Point to newNode
        // [head] -> [3] -> [5] -> [10] -> [15] -> NULL
        head = new_Node;
    }

    /*
     * 111 --> 222 --> 333 --> null
     * 
     * null replcae with 444
     */
    // 02) Inserting the data last
    void addLast(int data) {

        // [new_Node] -> [20] -> NULL
        Node new_Node = new Node(data);

        if (head == null) {
            head = new_Node;
            return;
        }

        Node temp = head; // Start from the head

        while (temp.next != null) {
            temp = temp.next;
        }

        /*
         * First iteration
         * Check: temp.next != null (True because [5] -> [10]).
         * Move: temp = temp.next (Now, temp points to [10]).
         */

        temp.next = new_Node;
    }

    // 03) Inserting the data at position
    /*
     * 1 2 4 5 6 7 8 postion -> 4 data -> 20
     * 
     * 1 2 3 4 5--> 20 --> 6 7 8
     * 5 previousNode
     * 
     * prevoiusNode.next = 20 (NewNode)
     * 
     * newNode.next --> current node (6)
     * 
     */
    void insertGivenPostion(int data, int postion) {

        // Start
        Node newNode = new Node(data);

        int i = 0;
        if (head == null) {
            head = newNode;
            return;
        }

        if (postion != 0) {

            Node currentNode = head;
            Node previousNode = null;

            while (currentNode.next != null && i < postion) {

                previousNode = currentNode;
                currentNode = currentNode.next;
                i++;
            }

            previousNode.next = newNode;
            newNode.next = currentNode;
        }
        // Change to zero postion
        else {
            // start index next
            newNode.next = head;
            head = newNode;
        }
    }

    // 04A) Sorted Insertion Asc/Desc
    public void Insertion_Asc(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        }

        // Left side satisy
        Node currentNode = head;
        if (currentNode.next != null && currentNode.data > data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // right side
        while (currentNode.next != null && currentNode.data < data) {

            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    // 04B) Sorted Insertion Desc
    public void Insertion_Dsc(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        }

        // Left side satisy
        Node currentNode = head;
        if (currentNode.next != null && currentNode.data < data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // right side
        while (currentNode.next != null && currentNode.data > data) {

            currentNode = currentNode.next;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }

    // 06) Size or Length of list
    int size_List() {
        return this.size;
    }

    // 08) Searching
    Boolean search(int data) {

        Node currentNode = head.next;

        while (currentNode != null) {

            if (currentNode.data == data) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // 09) Deleting from first
    void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;

    }

    // 10) Deleting from last
    /*
     * 1 -> 2 --> 3 -> 4 -> 5 - > null
     * 
     * first iteration checck 3 value is not null
     * second itratio check 4 value is not null
     * third iteration check 5 value is not null
     * four iteration check null value is null ( previous number null)
     */
    void deleteLast() {

        if (head == null) {

            System.out.println("List is empty");
            return;
        }

        /*
         * 1 -> null
         * 
         * expected
         * 
         * null
         */
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp1 = head;
        Node temp2 = head.next;

        while (temp2.next != null) {

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1.next = null;
    }
}
