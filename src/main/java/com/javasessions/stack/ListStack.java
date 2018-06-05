package com.javasessions.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<T> extends ArrayList<T> implements StackInterface<T>{

    private List<T> data;
    private int stackPointer;

    public ListStack() {
        data = new ArrayList<>();
    }

    public void push(T newItem) {
        data.add(newItem);
    }

    public T pop() {
        return data.remove(0);
    }

//    public boolean contains(T item) {
//
//    }

    public T access(T item){
        return data.stream().filter( n -> n.equals(item)).findAny().get();
    }

    public int size() {
        return data.size();
    }
}
