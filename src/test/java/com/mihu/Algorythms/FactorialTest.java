package com.mihu.Algorythms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    private Factorial factorial;

    @BeforeEach
    private void createInstance(){
        this.factorial = new Factorial();
    }

    @Test
    public void test5is120(){
        long expected = 120;
        assertEquals(expected, factorial.factorial(5));
    }

    @Test
    public void test0is1(){
        long expected = 1;
        assertEquals(expected, factorial.factorial(0));
    }

    @Test
    public void test1is1(){
        long expected = 1;
        assertEquals(expected, factorial.factorial(1));
    }

    @Test
    public void test2is2(){
        long expected = 2;
        assertEquals(expected, factorial.factorial(2));
    }

    @Test
    public void test3is6(){
        long expected = 6;
        assertEquals(expected, factorial.factorial(3));
    }

    @Test
    public void test3is6stream() {
        long expected = 6;
        assertEquals(expected, factorial.factorialStream(3));
    }


}