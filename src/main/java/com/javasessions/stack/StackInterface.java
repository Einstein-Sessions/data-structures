package com.javasessions.stack;

public interface StackInterface<T> {
    /**
     *
     * @param newItem - to be pushed on top of the stack.
     */
    void push(T newItem);

    /**
     * Removes the element on top of the stack.
     *
     * @return - the new stack without the element removed element
     * at the top of the stack
     */
    T pop();

    boolean contains(T item);

    T access(T item);

    int size();
}
