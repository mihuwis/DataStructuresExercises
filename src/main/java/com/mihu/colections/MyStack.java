package com.mihu.colections;

import com.mihu.colections.customExceptions.StackIsFullException;

import java.util.Arrays;

public class MyStack<T>{

    private int size;
    public Object[] stack;
    private int indexOfLastElement;

    public MyStack(int size) {
        this.size = size;
        this.stack = new Object[size];
        this.indexOfLastElement = -1;
    }

    public int getIndexOfLastElement() {
        return this.indexOfLastElement;
    }

    public int getSize(){
        return this.size;
    }

    public void push(T i) throws StackIsFullException{
        System.out.println(stack.length + " " + indexOfLastElement);

        if(!isStackFull()){
            stack[++indexOfLastElement] = i;
        } else {
            throw new StackIsFullException();
        }
    }

    public void pop() {
        indexOfLastElement--;
    }

    private boolean isStackFull() {
        return indexOfLastElement == size -1;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=indexOfLastElement; i++){
            sb.append(stack[i].toString()).append(" ");
        }
        return sb.toString();
    }
}
