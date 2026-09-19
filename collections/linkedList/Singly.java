package collections.linkedList;

public class Singly {

    // step 1 - node class

    static class Node {

        int data; // data part

        Node next; // reference to the next node

        Node(int data) {

            this.data = data;

            this.next = null;

        }
    }

    // head of the linked list

    Node head;

    // step 2 - insert at end

    // create a new node

    public void insertAtEnd(int data) {

        Node newNode = new Node(data);

        // if list is empty

        if (head == null) {

            head = newNode;

            return;

        }

        Node temp = head;

        while (temp.next != null) {

            temp = temp.next;

        }

        // connect the last node to the new node

        temp.next = newNode;

    }

    // step 3- insert at beginning

    public void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        newNode.next = head;

        head = newNode;

    }

    // step 4 - delete by value

    public void delete(int key) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (head.data == key) {
            head = head.next;
            return;

        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;

        }
        if (temp.next == null) {
            System.out.println("Value not found.");
        } else {
            temp.next = temp.next.next;
        }

    }

    // step 5 - display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        Singly newSingly = new Singly();
        newSingly.insertAtEnd(1);
        newSingly.insertAtEnd(2);
        newSingly.insertAtEnd(3);

        newSingly.display();

        newSingly.insertAtBeginning(4);
        newSingly.delete(2);

        newSingly.display();

    }

}