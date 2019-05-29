package com.mihu.colections;

import com.mihu.colections.customExceptions.StackIsFullException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    MyStack myStack;

    @BeforeEach
    private void createInstance(){
        this.myStack = new MyStack(30);
    }

    @Test
    public void testSizeOfArrayAfterAdditionMethod() throws StackIsFullException {
        int expected = 2;

        populateStack(2);

        assertEquals(expected, myStack.getIndexOfLastElement() + 1);
    }

    @Test
    public void testEqualityOfArrays() throws StackIsFullException {
        int[] expected = {0, 1, 2, 3};

        populateStack(4);

        assertArrayEquals(expected, getValuesFromStack(myStack.getIndexOfLastElement()));
    }

    @Test
    public void testIfPopRemovesLastElement() throws StackIsFullException {
        int[] expected = {0, 1, 2};
            populateStack(4);

        myStack.pop();

        assertArrayEquals(expected, getValuesFromStack(myStack.getIndexOfLastElement()));
    }

    @Test
    public void testExeptionwhenStackFull() throws StackIsFullException {
        populateStack(30);

        assertThrows(StackIsFullException.class, ()-> myStack.add(2));
    }

    private void populateStack(int numberOfElementsToAdd) throws StackIsFullException{
        IntStream.range(0, numberOfElementsToAdd).forEach(x -> {
            try {
                myStack.add(x);
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