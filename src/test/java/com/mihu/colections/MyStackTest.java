package com.mihu.colections;

import com.mihu.colections.customExceptions.StackIsFullException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    MyStack<Object> myStack;

    @BeforeEach
    private void createInstance(){
        this.myStack = new MyStack<>(30);
    }

    @Test
    public void testSizeOfArrayAfterAdditionMethod() throws StackIsFullException {
        int expectedIndexOfLastElement = 1;

        populateStack(2);

        assertEquals(expectedIndexOfLastElement, myStack.getIndexOfLastElement());
    }

    @Test
    public void testEqualityOfArrays() throws StackIsFullException {
        String expectedStringConversion = "0 1 2 3 ";

        populateStack(4);

        assertEquals(expectedStringConversion, myStack.toString());
    }

    @Test
    public void testIfPopRemovesLastElement() throws StackIsFullException {
        String expectedStringConversion = "0 1 2 ";
            populateStack(4);

        myStack.pop();

        assertEquals(expectedStringConversion, myStack.toString());
    }

    @Test
    public void testExeptionwhenStackFull() throws StackIsFullException {
        populateStack(30);

        assertThrows(StackIsFullException.class, ()-> myStack.push(2));
    }

    private void populateStack(int numberOfElementsToAdd) throws StackIsFullException{
        IntStream.range(0, numberOfElementsToAdd).forEach(x -> {
            try {
                myStack.push(x);
            } catch (StackIsFullException e) {
                e.printStackTrace();
            }
        });
    }

    private int[] getValuesFromStack(int lastIndex){
        int[] valuesInStack = new int[lastIndex + 1];
        System.arraycopy(myStack.stack, 0, valuesInStack, 0, lastIndex + 1);
        return valuesInStack;
    }

}