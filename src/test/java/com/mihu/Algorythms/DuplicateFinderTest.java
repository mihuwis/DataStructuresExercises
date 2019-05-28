package com.mihu.Algorythms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateFinderTest {

    DuplicateFinder duplicateFinder;

    @BeforeEach
    public void instacne(){
        this.duplicateFinder = new DuplicateFinder();
    }

    @Test
    public void test3elementNonRepetition(){
        boolean expected = true;
        Integer [] arr = {1, 2, 3};
        assertEquals(expected, duplicateFinder.duplicateFinder(arr));
    }

    @Test
    public void test3elementRepetition(){
        boolean expected = false;
        Integer [] arr = {1, 2, 3, 3};
        assertEquals(expected, duplicateFinder.duplicateFinder(arr));
    }



}