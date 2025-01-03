package com.vinay.Striver.step6.lec1.L4;
//https://takeuforward.org/linked-list/find-the-length-of-a-linked-list
public class L4LengthOfLinkedList {
    // Function to calculate the length of a linked list
    private static int lengthofaLL(Node head){
        int cnt=0;
        Node temp=head;
        // Traverse the linked list and count nodes
        while(temp!=null){
            temp = temp.next;
            cnt++;// increment cnt for every node traversed
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[]arr={2,5,8,7};
        Node head = new Node(arr[0]);
        head.next= new Node(arr[1]);
        head.next.next= new Node(arr[2]);
        head.next.next.next= new Node(arr[3]);
        // Print the length of the linked list
        System.out.println(lengthofaLL(head));
    }
}
class Node{
    int data;
    Node next;
    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}