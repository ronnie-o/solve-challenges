package com.hackerrank.day14;

import java.util.Arrays;

/**
 * Created by ronnie on 2017. 8. 18.
 */
public class Difference {
    private int[] elements;
    public int maximumDifference;
    
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        Arrays.parallelSort(elements);
        this.maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
    }
}
