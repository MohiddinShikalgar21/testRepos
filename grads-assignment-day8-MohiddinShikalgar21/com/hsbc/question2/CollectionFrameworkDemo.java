package com.hsbc.question2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionFrameworkDemo {
    public static void main(String[] args) {
        
        System.out.println("ArrayList:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        printList(arrayList);

        System.out.println("\nVector:");
        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Elephant");
        vector.add("Fox");
        printList(vector);

        System.out.println("\nLinkedList:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Giraffe");
        linkedList.add("Horse");
        linkedList.add("Iguana");
        printList(linkedList);
       
        String[] array = {"Jack", "King", "Queen"};
        List<String> listFromArray = arrayToList(array);
        System.out.println("\nList from array:");
        printList(listFromArray);
    }

    public static void printList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
