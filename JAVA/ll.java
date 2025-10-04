/*
 A Linked List is a linear data structure where elements (nodes) are stored non-contiguously in memory.

Each node contains:
Data (value of the element)
Next (reference to the next node)

 */



class LinkedList {
    int data;
    LinkedList next;

    LinkedList(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    LinkedList head;

    // Insert at beginning
    public void insertAtBeginning(int data) {
        LinkedList newNode = new LinkedList(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int data) {
        LinkedList newNode = new LinkedList(data);
        if (head == null) {
            head = newNode;
            return;
        }
        LinkedList temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete a node by value
    public void delete(int key) {
        LinkedList temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next; // delete head
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return; // not found

        prev.next = temp.next;
    }

    // Search an element
    public boolean search(int key) {
        LinkedList temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // Reverse the linked list
    public void reverse() {
        LinkedList prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Display the list
    public void display() {
        LinkedList temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class ll {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Insertion
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtBeginning(5);

        System.out.println("Linked List:");
        list.display(); // 5 -> 10 -> 20 -> 30 -> null

        // Searching
        System.out.println("Searching 20: " + list.search(20)); // true
        System.out.println("Searching 50: " + list.search(50)); // false

        // Deletion
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display(); // 5 -> 10 -> 30 -> null

        // Reversing
        list.reverse();
        System.out.println("After reversing:");
        list.display(); // 30 -> 10 -> 5 -> null
    }
}
