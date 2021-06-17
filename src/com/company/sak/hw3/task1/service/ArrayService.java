package com.company.sak.hw3.task1.service;

import com.company.sak.hw3.task1.entity.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayService {

    public static void bubbleSort(Array currentArray) {
        for (int i = currentArray.getCapacity() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (currentArray.get(j) > currentArray.get(j + 1)) {
                    int tmp = currentArray.get(j);
                    currentArray.set(j, currentArray.get(j + 1));
                    currentArray.set(j + 1, tmp);
                }
            }
        }
    }

    public static void insertionSort(Array currentArray) {
        for (int i = 1; i < currentArray.getCapacity(); i++) {
            int current = currentArray.get(i);
            int j = i - 1;
            while (j >= 0 && current < currentArray.get(j)) {
                currentArray.set(j + 1, currentArray.get(j));
                j--;
            }
            currentArray.set(j + 1, current);
        }
    }

    public static void selectionSort(Array currentArray) {
        for (int i = 0; i < currentArray.getCapacity(); i++) {
            int value = currentArray.get(i);
            int min = i;
            for (int j = i + 1; j < currentArray.getCapacity(); j++) {
                if (currentArray.get(j) < value) {
                    value = currentArray.get(j);
                    min = j;
                }
            }
            if (i != min) {
                int tmp = currentArray.get(i);
                currentArray.set(i, currentArray.get(min));
                currentArray.set(min, tmp);
            }
        }
    }

    public static int binarySearch(Array currentArray, int elementToSearch) {

        int firstElement = 0;
        int lastElement = currentArray.getCapacity() - 1;

        while (firstElement <= lastElement) {
            int middleElement = (firstElement + lastElement) / 2;
            if (currentArray.get(middleElement) == elementToSearch) {
                return middleElement;
            } else if (currentArray.get(middleElement) < elementToSearch)
                firstElement = middleElement + 1;
            else if (currentArray.get(middleElement) > elementToSearch)
                lastElement = middleElement - 1;
        }
        return -1;
    }

    public static int findMax(Array currentArray) {
        int max = currentArray.get(0);
        for (int i = 0; i < currentArray.getCapacity(); i++) {
            if (currentArray.get(i) > currentArray.get(0)) {
                max = currentArray.get(i);
            }
        }
        return max;
    }

    public static int findMin(Array currentArray) {
        int min = currentArray.get(0);
        for (int i = 0; i < currentArray.getCapacity(); i++) {
            if (currentArray.get(i) < currentArray.get(0)) {
                min = currentArray.getCurrentArray()[i];
            }
        }
        return min;
    }

    public static int[] findPrimeNumber(Array currentArray) {
        List<Integer> arrayCopy = new ArrayList();
        for (int i = 0; i < currentArray.getCapacity(); i++) {
            boolean isPrime = true;
            if (currentArray.get(i) == 1 || currentArray.get(i) < 0)
                isPrime = false;
            else {
                for (int j = 2; j <= currentArray.get(i) / 2; j++) {
                    if (currentArray.get(i) % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                arrayCopy.add(currentArray.get(i));
            }
        }
        return masCopyOfArray(arrayCopy);
    }

    public static int[] fibonacciNumbers(Array currentArray) {
        List<Integer> arrayCopy = new ArrayList();
        for (int i = 0; i < currentArray.getCapacity(); i++) {
            int first = 0;
            int second = 1;
            if (currentArray.get(i) == 0 && currentArray.get(i) == 1) {
                arrayCopy.add(currentArray.get(i));
            } else if (currentArray.get(i) > 0) {
                while (second < currentArray.get(i)) {
                    int temp = second;
                    second = second + first;
                    first = temp;
                    if (second == currentArray.get(i)) {
                        arrayCopy.add(currentArray.get(i));
                    }
                }
            }
        }
        return masCopyOfArray(arrayCopy);
    }

    public static int[] findDigitsNumbers(Array array) {
        List<Integer> arrayCopy = new ArrayList();
        int value;
        for (int i = 0; i < array.getCapacity(); i++) {
            value = Math.abs(array.get(i));
            if (100 < value && value <= 987) {
                int firstNumber = value / 100;
                int secondNumber = value / 10 % 10;
                int thirdNumber = value % 10;
                if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber){
                    arrayCopy.add(array.get(i));
                }
            }
        }
        return masCopyOfArray(arrayCopy);
    }

    public static int[] masCopyOfArray(List<Integer> arrayCopy) {
        int[] copy = new int[arrayCopy.size()];
        for (int i = 0; i < arrayCopy.size(); i++) {
            copy[i] = arrayCopy.get(i);
        }
        return copy;
    }
}
