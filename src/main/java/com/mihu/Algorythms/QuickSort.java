package com.mihu.Algorythms;

public class QuickSort {

    public int[] quickSorting(int[] arrOrig, int start, int end){
        int[] arr = arrOrig;
        if (start < end){
            int partitionIndex = partition(arr, start, end);
            quickSorting(arr, start, partitionIndex - 1);
            quickSorting(arr, partitionIndex + 1, end);
        }

        return arr;
    }

    private int partition(int[] arr, int start, int end) {
        int pivotValue = arr[end];
        int partitionPoint = start - 1;

        for (int j = start; j <= end; j++){
            if(arr[j] <= pivotValue){
                partitionPoint++;

                int temp = arr[partitionPoint];
                arr[partitionPoint] = arr[j];
                arr[j] = temp;
            }
        }

//        int temp = arr[partitionPoint + 1];
//        arr[partitionPoint + 1] = arr[end];
//        arr[end] = temp;

        return partitionPoint;
    }


}
