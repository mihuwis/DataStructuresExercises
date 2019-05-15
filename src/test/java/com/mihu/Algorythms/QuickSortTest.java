package com.mihu.Algorythms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    private QuickSort quickSort;

    @BeforeEach
    private void createInstance(){
        this.quickSort = new QuickSort();
    }

    @Test
    public void testIfOneItemArrReturnsOneItemArr(){
        int [] expected = {1};
        int [] arrToSort = {1};

        assertArrayEquals(expected, quickSort.quickSorting(arrToSort, 0, arrToSort.length - 1));
    }

    @Test
    public void test5elementArray(){
        int [] expected = {1, 2, 3, 7, 9};
        int [] arrToSort = {7, 9, 3, 1, 2};

        assertArrayEquals(expected, quickSort.quickSorting(arrToSort, 0, arrToSort.length - 1));
    }

}