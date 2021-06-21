package com.company.sak.hw3.task2;

import com.company.sak.hw3.task2.comparator.ArrayComparator;
import com.company.sak.hw3.task2.comparator.ArrayMaxElemComparator;
import com.company.sak.hw3.task2.comparator.ArrayMinElemComparator;
import com.company.sak.hw3.task2.comparator.ArraySumElemComparator;
import com.company.sak.hw3.task2.service.ArrayService;

import java.util.Arrays;

public class Main {

    private final static ArrayComparator arraySumElemComparator = new ArraySumElemComparator();
    private final static ArrayComparator arrayMaxElemComparator = new ArrayMaxElemComparator();
    private final static ArrayComparator arrayMinElemComparator = new ArrayMinElemComparator();

    public static void main(String[] args) {
        int[][] currentArray = new int[5][];

        currentArray[0] = new int[]{20, 131, 7, 41, 69};
        currentArray[1] = new int[]{12, 25, 41};
        currentArray[2] = new int[]{2, 3, 40, 5, 16};
        currentArray[3] = new int[]{3};
        currentArray[4] = new int[]{15, 7};

        arraySumElemComparator.calcRowValue(new int[]{});
        ArrayService.bubbleSort(currentArray, arraySumElemComparator);
        ArrayService.invert(currentArray);
        printCurrentArray(currentArray);
    }


    private static void printCurrentArray(int[][] currentArray) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentArray.length; i++) {
            System.out.print("[");
            for (int j = 0; j < currentArray[i].length; j++) {
                if (currentArray[i].length - 1 == j){
                    System.out.print(" " + currentArray[i][j] + " ");
                } else {
                    System.out.print(" " + currentArray[i][j] + ", ");
                }
            }
            System.out.println("]");
        }
        System.out.println();
    }
}
