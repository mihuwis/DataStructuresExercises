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
    public void testEmpty(){
        int [] expected = {};
        int [] arrToSort = {};

        assertArrayEquals(expected, quickSort.quickSorting(arrToSort, 0, arrToSort.length - 1));
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

    @Test
    public void test10elementArray(){
        int [] expected = {1, 2, 3, 4, 7, 7, 8, 9, 12, 19};
        int [] arrToSort = {7, 9, 3, 1, 2, 19, 4, 8, 7, 12};

        assertArrayEquals(expected, quickSort.quickSorting(arrToSort, 0, arrToSort.length - 1));
    }

    @Test
    public void test10anotherelementArray(){
        int [] expected = {1, 1, 2, 3, 4, 7, 7, 8, 9, 12, 19};
        int [] arrToSort = {7, 9, 3, 12, 2, 1, 4, 8, 7, 19, 1};

        assertArrayEquals(expected, quickSort.quickSorting(arrToSort, 0, arrToSort.length - 1));
    }


}