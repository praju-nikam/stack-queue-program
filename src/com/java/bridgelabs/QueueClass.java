package com.java.bridgelabs;

public class QueueClass {

    static class Node {
        String data;
        Node next;

        //Create Constructor
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        //Enqueue - Add Element in Queue
        public static void add(String data) {
            Node newNode = new Node(data);

            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }



    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Queue.add("Praju");
        Queue.add("Vaibhav");
        Queue.add("Anvi");
        Queue.add("Rohit");


    }
}
