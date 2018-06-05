package com.javasessions.stack;

public class BasicStack<T> implements StackInterface<T> {
    private T [] data;
    private int stackPointer;

    public BasicStack() {
        data = (T[])new Object[1000];
        stackPointer = 0;
    }

    public void push(T newItem) {
        data[stackPointer++] = newItem;
    }

    public T pop() {
        if (stackPointer == 0) {
            throw new IllegalStateException("No More Items on the Stack");
        }

        return data[stackPointer--];
    }

    public boolean contains(T item) {
        boolean found = false;

        for (T value : data) {
            if (value.equals(item)){
                found = true;
                break;
            }
        }

        return found;
    }

    public T access(T item){
        while (stackPointer > 0) {
            T tmpItem = pop();
            if (item.equals(tmpItem)) {
                return tmpItem;
            }
        }

        // In case we do not find anything in the stack, we will throw an exception.
        throw new IllegalArgumentException("Could not find item on the stack" + item);
    }

    public int size() {
        return stackPointer;
    }
}
