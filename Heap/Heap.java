package Heap;
import java.util.ArrayList;
public class Heap<T extends Comparable<T>> {
    
    private ArrayList<T> list;
    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first , int sec) {
        T temp = list.get(first);
        list.set(first , list.get(sec));
        list.set(sec, temp);
    }

    private int parent(int idx) {
        return (idx - 1)/2;
    }

    private int left(int idx) {
        return (2 * idx) + 1;
    }
    private int right(int idx) {
        return (2 * idx) + 2;
    }

    public void insert(T item) {
        list.add(item);
        upHeap(list.size() - 1);
    }
    private void upHeap(int idx) {
        if(idx == 0) return;
        int p = parent(idx);
        if(list.get(idx).compareTo(list.get(p)) < 0){
            swap(p , idx);
            upHeap(p);
        }
    }

    public T delete() throws Exception {
        if(list.isEmpty()) {
            throw new Exception("Heap is Empty !");
        }
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if(!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }
    private void downHeap(int idx) {
        if(idx == list.size())  return;
        int left = left(idx);
        int right = right(idx);
        int min = left;
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }
        if(min != idx) {
            swap(min , idx);
            downHeap(min);
        }
    }

    public void display() {
        System.out.println(list);
    }
}
