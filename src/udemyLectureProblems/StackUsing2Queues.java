package udemyLectureProblems;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues<T> {
    private Queue<T> q1, q2;

    /*Initialize 2 queues*/
    StackUsing2Queues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /*Insert item in the stack.*/
    private void push(T data) {
        try {
            /*Push item into first queue*/
            q1.add(data);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Remove item from the stack*/
    private T pop() {
        T front = null;
        try {
            if(q1.isEmpty()) {
                System.out.println("Underflow \n Terminating program.");
                System.exit(1);
            }
            /*Move all elements from first queue to 2nd queue except the last element*/
            while(!q1.isEmpty()) {
                if(q1.size() == 1) {
                    front = q1.peek();
                } else {
                    q2.add(q1.peek());
                }
                q1.poll();
            }

            /*Return the last element after moving all element from 2nd queue to 1st queue.*/
            while (!q2.isEmpty()) {
                q1.add(q2.peek());
                q2.poll();
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return front;
    }

    public static void main(String[] args) {
        try {
            int[] keys = {1,2,3,4,5};
            /*Inset above key into stack.*/
            StackUsing2Queues s = new StackUsing2Queues();

            for(int key : keys) {
                s.push(key);
            }
            System.out.println(s.pop());
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
