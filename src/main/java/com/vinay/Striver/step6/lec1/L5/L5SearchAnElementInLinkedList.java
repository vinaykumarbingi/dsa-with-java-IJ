package com.vinay.Striver.step6.lec1.L5;
//https://takeuforward.org/linked-list/search-an-element-in-a-linked-list
public class L5SearchAnElementInLinkedList {
    // Function to check if a given element is present in the linked list
    public static int checkifPresent(Node head, int desiredElement) {
        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            // Check if the current node's data is equal to the desired element
            if (temp.data == desiredElement)
                return 1;  // Return 1 if the element is found

            // Move to the next node
            temp = temp.next;
        }

        return 0;  // Return 0 if the element is not found in the linked list
    }

    // Main function
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3
        int[] arr = {1, 2, 3};
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);

        int val = 3;  // Element to be checked for presence in the linked list

        // Call the checkifPresent function and print the result
        System.out.print(checkifPresent(head, val));
    }
}
// Node class represents a node in a linked list
class Node {
    int data;      // Data stored in the node
    Node next;     // Reference to the next node in the list

    // Constructor with both data and next node as parameters
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    // Constructor with only data as a parameter, sets next to null
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}