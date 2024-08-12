import java.util.*;

public class kthNodeFromEnd {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    // Method to create and add elements to the linked list
    public static void createLL(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to print all elements in the linked list
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to find the k-th element from the end
    public static int find(Node head, int k) {
        int length = length(head);
        if (k > length || k <= 0) {
            return -1; // Invalid position
        }

        Node current = head;
        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Method to calculate the length of the linked list
    public static int length(Node head) {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void main(String[] args) {
        // Create a linked list with some elements
        createLL(10);
        createLL(20);
        createLL(30);
        createLL(40);
        createLL(50);

        // Print the linked list
        System.out.print("Linked List: ");
        printList();

        // Find the 2nd element from the end
        int k = 2;
        int result = find(head, k);
        System.out.println("The " + k + "th element from the end is: " + result);
    }
}
