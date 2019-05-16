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


    public void remove(int elementToRemove) {
        if(!isValueInArray(elementToRemove)) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (arr[lastElementIndex] == elementToRemove){
            lastElementIndex--;
        }
        for (int i = 0; i < lastElementIndex; i++){
            if(arr[i] == elementToRemove){
                for(int j = i; j < lastElementIndex; j++) {
                    arr[j] = arr[j + 1];
                }
                lastElementIndex--;
            }
        }
    }

    private boolean isValueInArray(int elementToCheck){
        for(int i = 0; i < lastElementIndex; i++){
            if(arr[i] == elementToCheck){
                return true;
            }
        }
        return false;
    }


    public void insert(int index, int numberToEnter) {
        if (index > this.lastElementIndex){
            add(numberToEnter);

        } else {
            for (int i = 0; i < lastElementIndex; i++){
                if(i == index) {
                    lastElementIndex++;
                    for (int j = lastElementIndex; j > i; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[i] = numberToEnter;
                }
            }
        }

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int number = 0; number < lastElementIndex + 1; number++){
            sb.append(" ").append(this.arr[number]);
        }
        return sb.toString();
    }

}
