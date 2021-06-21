package com.company.sak.hw3.task2.comparator;

public class ArraySumElemComparator extends ArrayComparator {

    @Override
    public int calcRowValue(int[] row) {
        int sum = 0;
        for (int value : row) {
            sum += value;
        }
        return sum;
    }
}
