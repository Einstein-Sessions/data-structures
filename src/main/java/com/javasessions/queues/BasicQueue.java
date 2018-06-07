package com.javasessions.queues;

public class BasicQueue<T> {
    private T[] data;

    public BasicQueue() {
        this(1000);
    }

    public BasicQueue(int size) {
        data = (T[])new Object[size];
    }
}
