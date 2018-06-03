package com.javasessions.stack;

public class BasicStack<T> {
    private T [] data;
    private int stackPointer;

    public BasicStack() {
        data = (T[])new Object[1000];
        stackPointer = 0;
    }

    /**
     *
     * @param newItem - to be pushed on top of the stack.
     */
    public void push(T newItem) {
        data[stackPointer++] = newItem;
    }

    /**
     * Removes the element on top of the stack.
     *
     * @return - the new stack without the element removed element
     * at the top of the stack
     */
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
