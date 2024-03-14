package Problem2;

public class StackLinkedList {
    Node head;
    int size;
    int numberOfElements=0;
    StackLinkedList(int s) {
        size = s;
    }
    class Node {
        int data;
        Node next = null;
        Node(int d) {
            data = d;
        }
    }

    public void push(int d) {
        if (numberOfElements == size) {
            System.out.println("Stack is full");
            return;
        }

        Node new_node = new Node(d);

        if (head == null) {
            head = new_node;
            numberOfElements++;
        } else {
            Node current_node = head;
            // travers until the end of LinkedList
            while (current_node.next != null) {
                current_node = current_node.next;
            }

            current_node.next = new_node;
            numberOfElements++;
        }
    }

    public int pop() {
        if (head == null) {
            return -1;
        } else {
            Node current_node = head, pred = null;
            // travers until the end of LinkedList
            while (current_node.next != null) {
                pred = current_node;
                current_node = current_node.next;
            }

            int data = current_node.data;

            pred.next = null;

            numberOfElements --;

            return data;
        }
    }

    public int peek() {
        if (head == null) {
            return -1;
        } else {
            Node current_node = head, pred = null;
            // travers until the end of LinkedList
            while (current_node.next != null) {
                current_node = current_node.next;
            }

            return current_node.data;
        }
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public int size() {
        return numberOfElements;
    }

    public void printStack() {
        Node current_node = head;
        while (current_node != null) {
            System.out.println(current_node.data);
            current_node = current_node.next;
        }
    }


}
