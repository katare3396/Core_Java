
public class Linked_List_CLass {

    /*
     * Linked List
     * 
     * the problems with array are
     * a) fixed in size
     * b) continoues memory locations
     * 
     * 
     * we can keep the data in any where , those data are linked with link.so that
     * we can perform all operation very effective
     * 
     * 
     * type of linked list :-
     * 1) single linked list
     * 2) double linked list
     * 3) circular single linked list
     * 4) circular double linked list
     * 
     * Representation linked list :-
     * Every linked list contains two part, a) data and b) next element ,
     * data :-it is used to repersent context
     * next elements :- it is used to point to next data reference
     * 
     * 
     * Node -->
     * 
     * Data : ->actual context --> int , double , char, booleanstring
     * next :--> next --> refernce to another node
     * 
     * 
     * Class Node{
     * datatype/ obj data ;
     * Node next ;
     * }
     * 
     * 
     * Head --> |111| | -> |222| | -> |333| | -> |444| | -> |555| | --> null
     * 
     */

    static Linked_List_My_CLass ll = new Linked_List_My_CLass();

    public static void main(String[] args) {

        // ll.Linked_list_working();

        // 01) Inserting the data first
        // ll.addFirst(300);
        // ll.addFirst(200);
        // ll.addFirst(100);

        // 02) Inserting the data last
        // ll.addLast(400);
        // ll.addLast(500);
        // ll.addLast(600);

        // 03) Inserting the data at position
        // ll.insertGivenPostion(0, 5);

        // 04A) Sorted Insertion Asc/Desc
        // ll.Insertion_Asc(150);
        // ll.Insertion_Asc(250);
        // ll.Insertion_Asc(50);
        // ll.Insertion_Asc(5);
        // ll.Insertion_Asc(500);

        // 04A) Sorted Insertion Desc
        ll.Insertion_Dsc(500);
        ll.Insertion_Dsc(250);
        // ll.Insertion_Dsc(50);
        // ll.Insertion_Dsc(500);
        // ll.Insertion_Dsc(500);

        // 05) Traversing or Displaying
        ll.println();

        // 06) Size or Length of list
        System.out.println(" Size of list --> " + ll.size_List());

        // 08) Searching
        // System.out.println("Searching " + ll.search(400));

        // ll.deleteFirst();
        // ll.println();

        // 10) Deleting from last
        // ll.deleteLast();
        // ll.println();
        // System.out.println(" Size of list --> " + ll.size_List());

        // 11) Delete Element
        // ll.deleteElement(500);
        // ll.println();
        // System.out.println(" Size of list --> " + ll.size_List());

        // 12) deleteElements
        // ll.deleteElements(500);
        // ll.println();
        // System.out.println(" Size of list --> " + ll.size_List());

        // 13) DeleteElementAt Position
        // ll.deleteElementAtPosition(3);
        // ll.println();
        // System.out.println(" Size of list --> " + ll.size_List());

        //  14) Reverse
        ll.reverse();
        ll.println();
        System.out.println(" Size of list --> " + ll.size_List());
    }

}
