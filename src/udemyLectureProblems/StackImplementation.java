package udemyLectureProblems;

import java.util.Stack;

public class StackImplementation {

    private int[] arr; //Array to store element in the stack.
    private int top; //Positioning top element in the stack.
    private int capacity; //Maximum capacity of the Stack.
    private int count; //Initial count of the Stack.

    /*Initialize Stack using constructor*/
    StackImplementation(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
        count = 0;
    }

    /*Utility to find size of the stack*/
    private int size() {
        return count;
    }

    /*Utility to check if stack is empty*/
    private boolean isEmpty() {
        return (size() == 0);
    }

    /*Utility to check if stack is full*/
    private boolean isFull() {
        return (size() == capacity);
    }

    /*Utility to Push element in the stack*/
    private void push(int item) {
        try {
            if(isFull()) {
                System.out.println("Overflow \n Terminating the program.");
                System.exit(1);
            }
            System.out.println("Pushing element " + item);
            top = (top + 1) % capacity;
            arr[top] = item;
            count++;
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Utility to remove element from stack*/
    private void pop() {
        try {
            if(isEmpty()) {
                System.out.println("Underflow \n Terminating program.");
                System.exit(1);
            }
            System.out.println("Removing item " + arr[top]);
            top = (top - 1)%capacity;
            count--;
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Utility to pick top element in the stack.*/
    private int peek() {
        if(isEmpty()) {
            System.out.println("Underflow \n Terminating program.");
            System.exit(1);
        }
        return arr[top];
    }

    public static void main(String[] args) {
        /*Create stack of size 5*/
        StackImplementation s = new StackImplementation(5);

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top element in the stack " + s.peek());
        s.pop();
        System.out.println("Top element in the stack " + s.peek());

        s.pop();
        if(s.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }

        System.out.println("*** Stack implementation from Java Lib ***");

        Stack<Integer> stack = new Stack<>();

        /*Pushing element in the stack.*/
        stack.add(1); stack.add(2); stack.add(3); stack.add(4);

        /*Display top element in the stack.*/
        System.out.println("Top element in the stack " + stack.peek());

        /*Removing one element from stack.*/
        stack.pop();
        /*Display top element in the stack.*/
        System.out.println("Top element in the stack " + stack.peek());

        if(stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is empty.");
        }

    }
}
