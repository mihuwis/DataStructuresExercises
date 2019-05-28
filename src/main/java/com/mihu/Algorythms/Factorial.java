package com.mihu.Algorythms;

import java.util.stream.LongStream;

public class Factorial {

    public long factorial(long number ) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number - 1);
    }

    public long factorialStream(long number){

        return LongStream.rangeClosed(1, number)
                .reduce(1, (long a, long b) -> a * b);
    }
}
