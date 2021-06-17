package com.company.sak.hw3.task1.entity;

import com.company.sak.hw3.task1.service.ArrayService;

import java.io.Serializable;
import java.util.List;

public class Array implements Serializable {

    private int capacity;
    private int[] currentArray;

    public Array() {
        capacity = 10;
        currentArray = new int[capacity];
    }

    public Array(int[] array) {
        capacity = array.length;
        currentArray = array;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[] getCurrentArray() {
        return currentArray;
    }

    public void setCurrentArray(List<Integer> currentArray) {
        capacity = currentArray.size();
        this.currentArray = ArrayService.masCopyOfArray(currentArray);
    }

    public int get(int index) {
        return currentArray[index];
    }
    public void set(int index, int number) {
        currentArray[index] = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array thatArray = (Array) o;
        int[] compareArray = thatArray.currentArray;
        if (currentArray.length != compareArray.length) {
            return false;
        }
        for (int i = 0; i < compareArray.length; i++) {
            if (currentArray[i] != compareArray[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        if (currentArray == null)
            return 0;
        int result = 1;

        for (Object element : currentArray)
            result = 31 * result + (element == null ? 0 : element.hashCode());

        return result;
    }

    @Override
    public String toString() {
        if (currentArray == null)
            return "null";
        int iMax = currentArray.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(currentArray[i]);
            if (i == iMax)
                return sb.append(']').toString();
            sb.append(", ");
        }
    }

    public static String toString(int[] currentArray) {
        if (currentArray == null)
            return "null";
        int iMax = currentArray.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; ; i++) {
            sb.append(currentArray[i]);
            if (i == iMax)
                return sb.append(']').toString();
            sb.append(", ");
        }
    }

}

