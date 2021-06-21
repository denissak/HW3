package com.company.sak.hw3.task2.comparator;

public class ArrayMaxElemComparator extends ArrayComparator {

    @Override
    public int calcRowValue(int[] row) {
        int maxValue = row[0];
        for (int value : row) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}
