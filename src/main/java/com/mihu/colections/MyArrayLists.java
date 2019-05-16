package com.mihu.colections;

import java.util.stream.IntStream;

public class MyArrayLists {

    private int arrSize;
    private int[] arr;
    private int lastElementIndex;

    public MyArrayLists(Integer size){
        this.arrSize = size;
        this.arr = new int[size];
        this.lastElementIndex = -1;
    }

    public MyArrayLists() {
        this.arrSize = 150;
        this.arr = new int[arrSize];
        this.lastElementIndex = -1;
    }


    public void add(int intToAdd) {
        int indexOfNewValue = ++ this.lastElementIndex;
        arr[indexOfNewValue] = intToAdd;

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int number = 0; number < lastElementIndex + 1; number++){
            sb.append(" ").append(this.arr[number]);
        }
        return sb.toString();
    }

}
