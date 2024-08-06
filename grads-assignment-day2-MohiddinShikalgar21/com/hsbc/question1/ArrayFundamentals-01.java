package com.hsbc.question1;
import java.util.Scanner;

public class ArrayFundamentals-01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        ArrayOperations arrayOps = new ArrayOperations(size);
       
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            arrayOps.addElement(scanner.nextInt());
        }

        arrayOps.selectionSort();
        System.out.print("Sorted array: ");
        arrayOps.display();

        System.out.print("Enter an element to remove: ");
        int elementToRemove = scanner.nextInt();
        arrayOps.removeElement(elementToRemove);
        System.out.print("Array after removing " + elementToRemove + ": ");
        arrayOps.display();

        System.out.print("Enter a position to remove element at that position: ");
        int positionToRemove = scanner.nextInt();
        arrayOps.removeElementAtPosition(positionToRemove);
        System.out.print("Array after removing element at position " + positionToRemove + ": ");
        arrayOps.display();

        System.out.print("Enter an element to find elements larger than it: ");
        int elementToCompare = scanner.nextInt();
        int[] largerElements = arrayOps.elementsLargerThan(elementToCompare);
        System.out.print("Elements larger than " + elementToCompare + ": ");
        System.out.println(Arrays.toString(largerElements));

        System.out.print("Enter an element and position to insert in the array: ");
        int elementToInsert = scanner.nextInt();
        int insertPosition = scanner.nextInt();
        arrayOps.insertElement(elementToInsert, insertPosition);
        System.out.print("Array after inserting " + elementToInsert + " at position " + insertPosition + ": ");
        arrayOps.display();
	}
}