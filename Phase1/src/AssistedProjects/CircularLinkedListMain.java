package AssistedProjects;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    CircularLinkedList() {
        head = null;
    }
    void insertSorted(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            head.next = head; 
        } else if (data < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != head && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    void display() {
        if (head == null) {
            System.out.println("The circular linked list is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }
}

public class CircularLinkedListMain {
    public static void main(String[] args) {
        CircularLinkedList circularList = new CircularLinkedList();

        circularList.insertSorted(3);
        circularList.insertSorted(1);
        circularList.insertSorted(2);
        circularList.insertSorted(5);
        circularList.insertSorted(4);

        System.out.println("Sorted Circular Linked List:");
        circularList.display();
    }
}
