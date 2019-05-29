package com.mihu.colections.customExceptions;

public class StackIsFullException extends Throwable{
    public StackIsFullException(){
        System.out.println("Stack is full!");
    }
}
