package Lec_42;

import java.util.Arrays;

public class Queue_Client {
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(10);
        q.enQueue(15);
        q.enQueue(20);
        q.enQueue(25);
        q.display();
        reverse(q);
        q.display();
    }
    public static void reverse(Queue q) throws Exception {
       if(q.isEmpty()) return;
       int item = q.deQueue();
       reverse(q);
       q.enQueue(item);

    }
    
}
