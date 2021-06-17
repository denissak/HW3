package com.company.sak.hw3.task1.input;

import com.company.sak.hw3.task1.entity.Array;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArrayInput {

    private final static int NUMBER_RANDOM = 100;

    public static Array autoCreateArray() {
        Random random = new Random();
        int element;
        Array array = new Array();
        List<Integer> currentArray = new ArrayList<>();
        int size = array.getCapacity();
        for (int i = 1; i <= size; i++) {
            element = random.nextInt(NUMBER_RANDOM);
            currentArray.add(element);
        }
        array.setCurrentArray(currentArray);
        return array;

    }

    public static Array readArrayOfFile() {
        Array array = new Array();
        List<Integer> currentArray = new ArrayList<>();
        try (FileReader reader = new FileReader("notes.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextInt()) {
                currentArray.add(scanner.nextInt());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        array.setCurrentArray(currentArray);
        return array;
    }

    public static Array readArrayOfConsole() {
        Array array = new Array();
        List<Integer> currentArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int capacity = scanner.nextInt();
        for (int i = 0; i < capacity; i++)
            if (!scanner.hasNextInt()) {
                scanner.next();
            } else {
                currentArray.add(scanner.nextInt());
            }
        array.setCurrentArray(currentArray);
        return array;
    }
}
