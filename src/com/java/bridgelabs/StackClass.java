package com.java.bridgelabs;

public class StackClass {
    //create class
    static class Node {
        // variables
        String data;
        Node next;

        // create constructor for Node Class
        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;          //variable

        // create function isEmpty()
        public static boolean isEmpty() {

            return head == null;
        }
 // Add push method
        public static void push(String data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
  // Add peek method
        public static String peek() {
            if (isEmpty()) {
                System.out.println("List is Empty");
            }
            return head.data;
        }
  // Add pop method
        public String pop() {
            if (isEmpty()) {
                System.out.println("List is Empty");
            }
            String top = head.data;
            head = head.next;
            return top;
        }
    }

        public static void main(String[] args) {
            Stack stack = new Stack();
            Stack.push("praju");
            Stack.push("Anvi");
            Stack.push("Rohit");
            Stack.push("Vaibhav");

            while (!Stack.isEmpty()) {
                System.out.println(Stack.peek());
                stack.pop();
            }
        }
    }