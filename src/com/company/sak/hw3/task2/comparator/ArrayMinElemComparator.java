package com.company.sak.hw3.task2.comparator;

public class ArrayMinElemComparator extends ArrayComparator {

    @Override
    public int calcRowValue(int[] row) {
        int minValue = row[0];
        for (int value : row) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }
}
