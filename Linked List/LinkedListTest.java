class SinglyLinkedList{
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void deleteAtBeginning(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd(){
        if(head == null || head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }

    public void display(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListTest{
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.println("After inserting 10, 20, 30:");
        list.display();

        list.insertAtBeginning(5);
        System.out.println("After inserting 5 at the beginning:");
        list.display();

        list.deleteAtBeginning();
        System.out.println("After deleting at the beginning:");
        list.display();

        list.deleteAtEnd();
        System.out.println("After deleting at the end:");
        list.display();
    }
}