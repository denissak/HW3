package com.company.sak.hw3.task2.service;

import java.util.Comparator;

public class ArrayService {

    public static void bubbleSort(int[][] currentArray, Comparator<Object> arrayComparator) {
        if (isMassiveNull(currentArray) || isMassiveEmpty(currentArray)) {
            return;
        }
        for (int i = currentArray.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (arrayComparator.compare(currentArray[j], currentArray[j + 1]) == 1) {
                    int[] tmp = currentArray[j];
                    currentArray[j] = currentArray[j + 1];
                    currentArray[j + 1] = tmp;
                }
            }
        }
    }

    public static void invert(int[][] currentArray) {
        if (isMassiveNull(currentArray) || isMassiveEmpty(currentArray)) {
            return;
        }
        int[] tmp;
        for (int i = 0; i < currentArray.length / 2; i++) {
            tmp = currentArray[i];
            currentArray[i] = currentArray[currentArray.length - 1 - i];
            currentArray[currentArray.length - 1 - i] = tmp;
        }
    }

    private static boolean isMassiveNull(int[][] currentArray) {
        return currentArray == null;
    }

    private static boolean isMassiveEmpty(int[][] currentArray) {
        return currentArray.length == 0;
    }

}
