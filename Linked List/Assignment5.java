public class Assignment5 {

    // --------------------------
    // Node Class
    // --------------------------
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // --------------------------
    // Singly Linked List Class
    // --------------------------
    class SinglyLinkedList {
        Node head;

        // Insert at a specific position
        public void insertAtPosition(int data, int position) {
            Node newNode = new Node(data);

            if (position == 1) {                 // Insert at head
                newNode.next = head;
                head = newNode;
                return;
            }

            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }

            if (temp == null) {
                System.out.println("Invalid position!");
                return;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }

        // Delete from a specific position
        public void deleteFromPosition(int position) {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }

            if (position == 1) {                // Delete head
                head = head.next;
                return;
            }

            Node temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }

            if (temp == null || temp.next == null) {
                System.out.println("Invalid position!");
                return;
            }

            temp.next = temp.next.next;
        }

        // Display list
        public void display() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    // --------------------------
    // Main Method (Testing)
    // --------------------------
    public static void main(String[] args) {

        Assignment5 outer = new Assignment5();
        SinglyLinkedList list = outer.new SinglyLinkedList();

        // Insert operations
        list.insertAtPosition(10, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);
        list.insertAtPosition(15, 2);   // Insert 15 at position 2

        System.out.println("List after insertions:");
        list.display();

        // Delete operation
        list.deleteFromPosition(3);

        System.out.println("List after deletion:");
        list.display();
    }
}
