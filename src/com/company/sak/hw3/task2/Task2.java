package com.company.sak.hw3.task2;

public class Task2 {

    public static void bubbleSort(int[] currentArray) {
        for (int i = currentArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (currentArray[j] > currentArray[j + 1]) {
                    int tmp = currentArray[j];
                    currentArray[j] = currentArray[j + 1];
                    currentArray[j + 1] = tmp;
                }
            }
        }
    }

    public static void sortRow(int[][] mas) {
        int[] newMas = new int[2];
        for (int i = 0; i < mas.length; i++) {
            int sumRow = 0;
            for (int j = 0; j < mas[i].length; j++) {
                sumRow += mas[i][j];
            }
            newMas[i] = sumRow;
        }
        bubbleSort(newMas);
    }
}
