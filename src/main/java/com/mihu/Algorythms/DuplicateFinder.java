package com.mihu.Algorythms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {

    public boolean duplicateFinder(Integer[] arr){
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return arr.length == set.size();
    }
}
