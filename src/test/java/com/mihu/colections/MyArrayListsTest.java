package com.mihu.colections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListsTest {


    @Test
    void DynamicIntArrayTest_WithInitialSize() {
        new MyArrayLists(150);
    }

    @Test
    void addTest() {
        MyArrayLists array = createArray(11);
        array.add(32);
        array.add(42);
        String result = " 0 1 2 3 4 5 6 7 8 9 10 32 42";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest() {
        MyArrayLists array = createArray(11);
        array.remove(5);
        array.remove(0);
        String result = " 1 2 3 4 6 7 8 9 10";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest_LastItem()
    {
        MyArrayLists array = createArray(10);
        array.remove(9);
        String result = " 0 1 2 3 4 5 6 7 8";
        assertEquals(result, array.toString());
    }

    @Test
    void removeTest_InvalidItem()
    {
        MyArrayLists array = createArray(10);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(10));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.remove(-1));
    }

    @Test
    void insertTest()
    {
        MyArrayLists array = createArray(11);
        array.insert(8, 223);
        array.insert(100, 654);

        String result = " 0 1 2 3 4 5 6 7 223 8 9 10 654";
        assertEquals(result, array.toString());
    }

    private MyArrayLists createArray(int numOfElements) {
        MyArrayLists array = new MyArrayLists();
        for (int i = 0; i < numOfElements; ++i)
        {
            array.add(i);
        }
        return array;
    }

}