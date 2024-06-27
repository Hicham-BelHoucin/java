package java_module_01.ex03;

public class TransactionsList implements TransactionsLinkedList {
    private Node head; // head of list

    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        int data;
        Node next;

        // Constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public TransactionsList addTransaction(TransactionsList list, int data) {
        // Create a new node with given data
        Node new_node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    };

    public Transaction removeTransactionById(String id) throws TransactionNotFoundException {

        throw new TransactionNotFoundException("ghdfjgs");
    };

    public void toArray() {
        Node last = this.head;
        while (last.next != null) {
            last = last.next;
        }
    };

}
