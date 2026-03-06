package Lec_42;
public class Queue {
    private int[] arr;
    private int front = 0;
    private int size = 0;

    public Queue() {
        arr = new int[5];
    }
    public Queue(int n) {
        arr = new int[n];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == arr.length;
    }

    public void enQueue(int item) throws Exception {
        if(isFull()) {
            throw new Exception("Queue is Full ");
        }
        int idx = (front + size) %  arr.length;
        arr[idx] = item;
        size++;
    }
    public int deQueue() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int item =  arr[front];
        front = (front + 1) % arr.length;
        size--;
        return item;
    }
    public int getFirst() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return arr[front];
    }
    public int getLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return arr[size - 1];
    }
    public void display() {
        for(int i = 0; i < size; i++){
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
    public int size(){
        return size;
    }



}
