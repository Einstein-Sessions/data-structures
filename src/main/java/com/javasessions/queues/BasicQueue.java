package com.javasessions.queues;

public class BasicQueue<T> {
    private T[] data;
    private int front;
    private int end;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        this.front = -1;
        this.end = -1;
        data = (T[])new Object[size];
    }

    public int size() {
        // if the queue is empty return 0
        if (this.front == -1 && this.end == -1) {
            return 0;
        }
        // otherwise we get the inclusive subtraction value rather than
        else {
            return end - front + 1;
        }
    }

    public void enQueue(T item) { }

    public T deQueue() { }
}
