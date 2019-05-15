package com.mihu;

import com.mihu.Algorythms.QuickSort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        QuickSort quickSort = new QuickSort();

        int[] arr = {7, 9, 3, 1, 2};

        quickSort.quickSorting(arr, 0, arr.length - 1);

        for(int number: arr){
            System.out.println(number + " ");
        }
    }
}
