package udemyLectureProblems;

import java.util.Stack;

public class QueueUsingTwoStacks<T> {
    private Stack<T> s1, s2; //Two stacks for performing Queue's operation.

    /*Constructor for initializing Stack 1 and Stack 2*/
    QueueUsingTwoStacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    /*Add data in the queue.*/
    private void enQueue(T data) {
        /*Push item into first stack.*/
        s1.push(data);
    }

    /*Remove data from the queue*/
    private T deQueue() {
        try {
            /*If both stacks are empty*/
            if(s1.isEmpty() && s2.isEmpty()) {
                System.out.println("Underflow \n Terminating program.");
                System.exit(1);
            }

            /*If 2nd stack is empty then push element from first stack to second stack.*/
            if(s2.isEmpty()) {
                while (!(s1.isEmpty())) {
                    s2.push(s1.pop());
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        /*Return top item from 2nd stack.*/
        return s2.pop();
    }

    public static void main(String[] args) {
        try {
            int[] keys = {1, 2, 3, 4, 5};
            QueueUsingTwoStacks q = new QueueUsingTwoStacks();

            /*Inset above keys*/
            for(int key : keys) {
                q.enQueue(key);
            }
            System.out.println("Removing " + q.deQueue());
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
