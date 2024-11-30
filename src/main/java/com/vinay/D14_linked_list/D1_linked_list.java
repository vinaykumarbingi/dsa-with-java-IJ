package com.vinay.D14_linked_list;

import org.w3c.dom.Node;

import java.util.Arrays;

public class D1_linked_list {

    private Node head;
    private Node tail;

    private int size;

    public D1_linked_list(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail == null){
            tail = node;
            head = tail;
        }else{
            tail.next = node;
            tail = node;
        }
        size += 1;
    }

    public void insertByIndex(int val, int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i =1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size += 1;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        D1_linked_list ll = new D1_linked_list();
        int[] list = {1,2,3,4,5};
//        Arrays.stream(list).forEach(value -> ll.insertFirst(value));
        Arrays.stream(list).forEach(value -> ll.insertLast(value));
        ll.insertByIndex(100,3);
        ll.display();
        System.out.println("size "+ll.size);
    }
}
