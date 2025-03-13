
public class Linked_List_My_CLass {

    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void println() {

        if (head == null) {
            System.out.println("list is empty");
            return;
        }
    }

}
