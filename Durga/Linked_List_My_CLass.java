
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

        Node new_Node = new Node(data);

        if (head == null) {
            head = new_Node;
            return;
        }
        new_Node.next = head;
        head = new_Node;
    }

    /*
     * 111 --> 222 --> 333 --> null
     * 
     * null replcae with 444
     */
    // 02) Inserting the data last
    void addLast(int data) {

        Node new_Node = new Node(data);

        Node temp = head;
        if (head == null) {
            head = new_Node;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_Node;
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

    void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;

    }

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
