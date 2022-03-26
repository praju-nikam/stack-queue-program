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

        //Dequeue  - Delete Element in Queue
        public static String remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
            }
            String front = head.data;
            // single Element in queue use this if condition
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }


        // peek - Peek The Element
        public static String peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Queue.add("Praju");
        Queue.add("Vaibhav");
        Queue.add("Anvi");
        Queue.add("Rohit");

        while (! Queue.isEmpty()) {
            System.out.println(Queue.peek());
            Queue.remove();
        }

    }
}
