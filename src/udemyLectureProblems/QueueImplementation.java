package udemyLectureProblems;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    /*Implementation of queue using array.*/

    private int arr[]; //array to store queue elements.
    private int front; //front points to front element in the queue.
    private int rear;  //rear points to last element in the queue.
    private int capacity; //maximum capacity of the queue.
    private int count; //current size of the queue.

    /*Constructor to initialize queue*/
    QueueImplementation(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    /*Utility function to return size of the queue...*/
    private int size() {
        return count;
    }

    /*Utility function to check if queue is empty or not...*/
    private boolean isEmpty() {
        return (size() == 0);
    }

    /*Utility function to check if queue is full or not...*/
    private boolean isFull() {
        return (size() == capacity);
    }

    /*Utility function to remove front element in the queue*/
    private void dequeue() {
        try {
            /*Check for queue underflow*/
            if(isEmpty()) {
                System.out.println("Underflow \n Program terminated.");
                System.exit(1);
            }
            System.out.println("Removing " + arr[front]);
            front = (front + 1) % capacity; //There is need of modulo operation here to keep front value one digit.
            count--;
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Utility function to add an item in the queue*/
    private void enqueue(int item) {
        try {
            /*Check for queue overflow*/
            if(isFull()) {
                System.out.println("Overflow \n Program terminated.");
                System.exit(1);
            }
            System.out.println("Adding " + item);
            rear = (rear + 1) % capacity;
            arr[rear] = item;
            count++;
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Utility function to return front element in the queue*/
    private int peek() {
        if(isEmpty()) {
            System.out.println("Underflow \n Program Terminated");
            System.exit(1);
        }
        return arr[front];
    }

    public static void main(String[] args) {
        /*Create a queue of size 5*/
        QueueImplementation q = new QueueImplementation(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println("Front element is: " +q.peek());
        q.dequeue();
        System.out.println("Front element is: " +q.peek());

        System.out.println("Queue size is " +q.size());

        q.dequeue();
        q.dequeue();

        if(q.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }

        System.out.println("*** Queue implementation using Java Library ***");
        /*Using Java libraries Queue...*/
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        /*Print front element of the queue.*/
        System.out.println("Front element of the queue is " + queue.peek());
        /*Remove one element from the queue.*/
        queue.remove();
        /*Print front element of the queue.*/
        System.out.println("Front element of the queue is " + queue.peek());

        /*Removing elements from the queue*/
        queue.remove();

        if(queue.isEmpty()) {
            System.out.println("Queue is Empty.");
        } else {
            System.out.println("Queue is not Empty.");
        }
    }
}
