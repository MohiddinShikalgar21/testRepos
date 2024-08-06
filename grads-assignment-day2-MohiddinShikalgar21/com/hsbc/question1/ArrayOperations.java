package com.hsbc.question1;
import java.util.Arrays;

public class ArrayOperations {
    private int[] array;
    private int size;

    public ArrayOperations(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public void addElement(int element) {
        array[size++] = element;
    }

    //method to sort array using selection sort
    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; 
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    //removing element by left shift of all further elements
    public boolean removeElement(int element) {
        int index = findElementIndex(element);
        if (index == -1) {
            System.out.println("Element " + element + " not found in the array.");
            return false;
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return true;
    }

    //remove element when position/index is specified
    public void removeElementAtPosition(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position. No element removed.");
            return;
        }
        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public int[] elementsLargerThan(int element) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > element) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > element) {
                result[index++] = array[i];
            }
        }
        return result;
    }

    public void insertElement(int element, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position. Element not inserted.");
            return;
        }
        for (int i = size - 1; i >= position; i--) {
            array[i + 1] = array[i];
        }
        array[position] = element;
        size++;
    }

    private int findElementIndex(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public void display() {
        System.out.println(Arrays.toString(array));
    }
}
