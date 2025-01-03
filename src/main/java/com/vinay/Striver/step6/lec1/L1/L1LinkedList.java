package com.vinay.Striver.step6.lec1.L1;

public class L1LinkedList {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        // Creating a new Node with the value from the array
        Node y = new Node(arr[0]);
        // Printing the data stored in the Node
        System.out.println(y.data);
        System.out.println(y.next);
    }


}

class Node {
    int data;      // the data value
    Node next;      // the reference to the next Node in the linked list
    // Constructors
    Node(int data1, Node next1) {
        this.data = data1;  // Initialize data with the provided value
        this.next = next1;  // Initialize next with the provided reference
    }
    Node(int data1) {
        this.data = data1;  // Initialize data with the provided value
        this.next = null;   // Initialize next as null since it's the end of the list
    }
}
