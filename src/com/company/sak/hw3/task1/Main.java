package com.company.sak.hw3.task1;

import com.company.sak.hw3.task1.entity.Array;
import com.company.sak.hw3.task1.exception.NullException;
import com.company.sak.hw3.task1.input.ArrayInput;
import com.company.sak.hw3.task1.service.ArrayService;


public class Main {

    public static void main(String[] args) throws NullException{
        int[] myArray = {18, -200, 153, 33, 152, -201, 211, 199};
//        int[] myArray = {7,2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};

        Array array = new Array(myArray);
        Array arrayAuto = ArrayInput.autoCreateArray();
        Array fileArray = ArrayInput.readArrayOfFile();
        Array consoleArray = ArrayInput.readArrayOfConsole();
        int[] a = ArrayService.fibonacciNumbers(array);
        int[] primeNumber = ArrayService.findPrimeNumber(array);
        int[] digitsNumbers = ArrayService.findDigitsNumbers(array);
        System.out.println("Фибоначи " + Array.toString(a));
//        ArrayManipulation.bubbleSort(myArray);
//        ArrayManipulation.insertionSort(myArray);
        ArrayService.selectionSort(array);
        System.out.println("Трехзначные числа " + Array.toString(digitsNumbers));

        ArrayService.bubbleSort(arrayAuto);

        System.out.println("Auto " + arrayAuto);
        System.out.println("Selection " + array);
        System.out.println("Max Number = " + ArrayService.findMax(array));
        System.out.println("Min Number = " + ArrayService.findMin(array));
        System.out.println(ArrayService.binarySearch(array, 18));
        System.out.println("Простые числа " + Array.toString(primeNumber));
        System.out.println("Auto " + arrayAuto);
        System.out.println("File " + fileArray);
        System.out.println("Console " + consoleArray);










    }
}
