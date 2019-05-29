package com.mihu.colections;

import com.mihu.colections.customExceptions.StackIsFullException;

public class MyStack {

    public int[] stack;
    private int indexOfLastElement;

    public MyStack(int size) {
        this.stack = new int[size];
        this.indexOfLastElement = -1;
    }

    public int getIndexOfLastElement() {
        return indexOfLastElement;
    }

    public void add(int i) throws StackIsFullException{
        if(indexOfLastElement == stack.length - 1){
            stack[++indexOfLastElement] = i;
        } else {
            throw new StackIsFullException();
        }
    }

    public void pop() {
        indexOfLastElement--;
    }
}
