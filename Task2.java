package Seminar_4;

import java.util.LinkedList;

public class Task2 {

    private LinkedList<Integer> list = new LinkedList<Integer>();

    public void enqueue(int item) {
        list.addLast(item);
    }

    public int dequeue() {
        return list.pollFirst();
    }

    public int first() {
        return list.peekFirst();
    }
}
