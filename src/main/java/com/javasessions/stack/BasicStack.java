package com.javasessions.stack;

public class BasicStack<T> {
    private T [] data;

    public BasicStack() {
        data = (T[])new Object[1000];
    }
}
