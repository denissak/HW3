package com.company.sak.hw3.task2.comparator;

import java.util.Comparator;

public abstract class ArrayComparator implements Comparator<Object> {

    @Override
    public int compare(Object firstArray, Object secondArray) {
        if (firstArray instanceof int[] && secondArray instanceof int[]) {
            int[] array1 = (int[]) firstArray;
            int[] array2 = (int[]) secondArray;
            int result = 0;
            if (calcRowValue(array1) > calcRowValue(array2)) {
                result = 1;
            } else if (calcRowValue(array1) < calcRowValue(array2)) {
                result = -1;
            }
            return result;
        }
        return -1;
    }

    public abstract int calcRowValue(int[] row);
}
