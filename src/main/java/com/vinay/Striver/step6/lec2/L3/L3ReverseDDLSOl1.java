package com.vinay.Striver.step6.lec2.L3;

import java.util.Stack;//https://takeuforward.org/data-structure/reverse-a-doubly-linked-list/
public class L3ReverseDDLSOl1 {
    public static class Node {
        // Data stored in the node
        public int data;
        // Reference to the next node
        //in the list (forward direction)
        public Node next;
        // Reference to the previous nod
        //in the list (backward direction)
        public Node back;

        // Constructor for a Node with both data,
        //a reference to the next node, and a
        //reference to the previous node
        public Node(int data1, Node next1, Node back1) {
            data = data1;
            next = next1;
            back = back1;
        }

        // Constructor for a Node with data,
        //and no references to the next and
        //previous nodes (end of the list)
        public Node(int data1) {
            data = data1;
            next = null;
            back = null;
        }
    }

    private static Node convertArr2DLL(int[] arr) {
        // Create the head node with the
        //first element of the array
        Node head = new Node(arr[0]);
        // Initialize 'prev' to the head node
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            // Create a new node with data from
            // the array and set its 'back' pointer
            // to the previous node

            Node temp = new Node(arr[i], null, prev);
            // Update the 'next' pointer of the
            // previous node to point to the new node

            prev.next = temp;
            // Move 'prev' to the newly created node
            //for the next iteration
            prev = temp;
        }
        // Return the head of the doubly linked list
        return head;
    }

    private static void print(Node head) {
        while (head != null) {
            // Print the data in the current node
            System.out.print(head.data + " ");
            // Move to the next node
            head = head.next;
        }
        System.out.println();
    }

    private static Node reverseDLL(Node head) {
        // Initialise a stack st
        Stack<Integer> st = new Stack<>();

        // Initialise the node pointer temp at head
        Node temp = head;

        // Traverse the doubly linked list via the temp pointer
        while(temp!=null){
            // insert the data of the current node into the stack
            st.push(temp.data);
            // traverse further
            temp = temp.next;
        }

        // Reinitialise temp to head
        temp = head;

        // Second iteration of the DLL to replace the values
        while(temp!=null){
            // Replace the value pointed via temp with
            // the value from the top of the stack and pop it
            temp.data = st.pop();

            // Traverse further
            temp = temp.next;
        }

        // Return the updated doubly linked
        // where the values of nodes from both ends
        // has been swapped
        return head;

    }



    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8, 4};
        // Convert the array to a doubly linked list
        Node head = convertArr2DLL(arr);

        // Print the doubly linked list
        System.out.println("Doubly Linked List Initially:  ");
        print(head);

        System.out.println("Doubly Linked List After Reversing :");

        head = reverseDLL(head);
        print(head);

    }
}
